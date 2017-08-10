package ru.javaluxurywatches.service.user;

import lombok.NonNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Field;

public abstract class UserEntityManager<T> {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public void merge(@NonNull T fromObj, @NonNull T toObj) {
        Field[] fields = toObj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value1 = field.get(fromObj);
                Object value2 = field.get(toObj);
                Object value = (value1 != null &&
                        !value1.equals("") &&
                        !value1.equals(value2)) ? value1 : value2;
                field.set(toObj, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        em.merge(toObj);
        em.flush();
    }
}

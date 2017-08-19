package ru.javaluxurywatches.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.user.UserDetail;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, Long> {

    UserDetail findById(Long id);

    List<UserDetail> findByGender(UserDetail.Gender gender);

    List<UserDetail> findByAddress(String address);

    List<UserDetail> findByCity(String city);

    List<UserDetail> findByCountry(String country);

    List<UserDetail> findByPostcode(Long postcode);

    List<UserDetail> findByDayOfBirth(Data data);
}

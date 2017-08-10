package ru.javaluxurywatches.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.user.UserDetail;
import ru.javaluxurywatches.repository.user.UserDetailRepository;

import javax.transaction.Transactional;
import javax.xml.crypto.Data;
import java.util.List;

@Service
@Transactional
public class UserDetailService extends UserEntityManager {

    private final UserDetailRepository userDetailRepository;

    @Autowired
    public UserDetailService(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public UserDetail findById(Long id) {
        return userDetailRepository.findById(id);
    }

    public List<UserDetail> findByGender(UserDetail.Gender gender) {
        return userDetailRepository.findByGender(gender);
    }

    public List<UserDetail> findByAddress(String address) {
        return userDetailRepository.findByAddress(address);
    }

    public List<UserDetail> findByCity(String city) {
        return findByCity(city);
    }

    public List<UserDetail> findByCountry(String country) {
        return userDetailRepository.findByCountry(country);
    }

    public List<UserDetail> findByPostcode(Long postcode) {
        return userDetailRepository.findByPostcode(postcode);
    }

    public List<UserDetail> findByDayOfBirth(Data data) {
        return userDetailRepository.findByDayOfBirth(data);
    }

    public void update(UserDetail userDetail) {
        if (userDetail.isNew()) {
            userDetailRepository.save(userDetail);
        } else {
            UserDetail currentUserDetail = findById(userDetail.getId());
            merge(userDetail, currentUserDetail);
        }
    }
}

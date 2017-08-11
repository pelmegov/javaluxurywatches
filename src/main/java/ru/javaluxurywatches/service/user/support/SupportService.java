package ru.javaluxurywatches.service.user.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.user.profile.Support;
import ru.javaluxurywatches.repository.user.support.SupportRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SupportService {
    private final SupportRepository supportRepository;

    @Autowired
    public SupportService(SupportRepository supportRepository) {
        this.supportRepository = supportRepository;
    }

    public Support findById(Long id) {
        return supportRepository.findById(id);
    }

    public List<Support> findAllByUserId(Long id) {
        return supportRepository.findAllByUserId(id);
    }
}

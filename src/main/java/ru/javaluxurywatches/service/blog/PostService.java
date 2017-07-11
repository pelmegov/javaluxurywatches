package ru.javaluxurywatches.service.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.javaluxurywatches.model.blog.Post;
import ru.javaluxurywatches.model.user.User;
import ru.javaluxurywatches.repository.blog.PostRepository;

import javax.transaction.Transactional;
import java.util.Set;

@Service
@Transactional
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Set<Post> findByAuthor(User user) {
        return postRepository.findByAuthor(user);
    }

    public Set<Post> findByAuthorId(Long id) {
        return postRepository.findByAuthorId(id);
    }

    public Set<Post> findByIsSlider(Boolean active) {
        return postRepository.findByIsSlider(active);
    }

    public Set<Post> findByIsActive(Boolean active) {
        return postRepository.findByIsActive(active);
    }

    public Page<Post> findByIsActive(Boolean active, Pageable pageable) {
        return postRepository.findByIsActive(active, pageable);
    }

    public Post findByLinkAndIsActive(String link, Boolean active) {
        return postRepository.findByLinkAndIsActive(link, active);
    }

}

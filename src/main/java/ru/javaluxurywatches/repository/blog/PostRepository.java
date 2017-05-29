package ru.javaluxurywatches.repository.blog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.blog.Post;
import ru.javaluxurywatches.model.user.User;

import java.util.Set;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    Set<Post> findByAuthor(User user);
    Set<Post> findByAuthorId(Long id);
    Set<Post> findByIsSlider(Boolean active);
    Set<Post> findByIsActive(Boolean active);
    Post findByLinkAndIsActive(String link, Boolean active);
}

package service;

import domain.Post;
import io.smallrye.mutiny.Uni;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class BlogServiceImpl implements BlogService {
    @Override
    public Uni<Post> save(Post post) {
        post.getComments().forEach(comment -> comment.setPost(post));
        return post.persistAndFlush();
    }
    @Override
    public Uni<List<Post>> findAll() {
        return Post.findAll().list();
    }
}

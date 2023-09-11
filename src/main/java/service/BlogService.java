package service;

import domain.Post;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface BlogService {

    Uni<Post> save(Post post);
    Uni<List<Post>> findAll();

}

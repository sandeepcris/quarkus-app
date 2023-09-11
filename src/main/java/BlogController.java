import domain.Post;
import io.smallrye.mutiny.Uni;
import service.BlogService;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import java.util.List;

@Path("/v1/blog")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class BlogController {
    private final BlogService blogService;
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GET
    public Uni<List<Post>> findAll()  {
        return blogService.findAll();
    }

    @POST
    public Uni<Post> save(Post post) {
        return blogService.save(post);
    }

}

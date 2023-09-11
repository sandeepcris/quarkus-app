package domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment extends PanacheEntity {
    private String review;

    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Post post;

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Post getPost() { return post; }

    public void setPost(Post post) { this.post = post; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

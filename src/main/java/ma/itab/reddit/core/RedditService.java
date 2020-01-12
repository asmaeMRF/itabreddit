package ma.itab.reddit.core;

import java.util.ArrayList;
import java.util.List;

public class RedditService {
    private List<Post> posts= new ArrayList<Post>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getAllposts() {
        return posts;
    }

}

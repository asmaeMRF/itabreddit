import ma.itab.reddit.core.Post;
import ma.itab.reddit.core.RedditService;

import java.util.List;


public class RedditApp {
    public static void main(String[] args){
        String postText1="blablablabla";
        String postText2="blibliblbilbilbi";
        RedditService redditService = new RedditService();
        Post post1= new Post("omar", postText1);
        Post post2= new Post("jack", postText2);

        post1.like();
        post1.like();
        post1.like();


        post2.like();
        post2.like();
        post2.dislike();


        redditService.addPost(post1);
        redditService.addPost(post2);
        List<Post> allPosts = redditService.getAllposts();
        for (Post p : allPosts){
            System.out.println(p.getLikes());
        }
        System.out.println(redditService.getAllposts());

    }

}

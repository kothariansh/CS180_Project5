import java.util.ArrayList;
import java.util.UUID;

public class Post {
    private String postContent;
    private String postID;
    private UserProfile owner;
    private ArrayList<String> postLikes;
    private ArrayList<String> disLikes;
    public Post(String content, UserProfile owner){
        this.owner = owner;
        this.postContent = content;
        UUID uniqueID = UUID.randomUUID();
        this.postID = uniqueID.toString();
    }
    public String getPostID() {
        return postID;
    }
    public String getPostContent() {
        return postContent;
    }
    public ArrayList<String> getPostLikes() {
        return postLikes;
    }
    public void likePost(UserProfile user){
        postLikes.add(user.getUsername());
    }
    public void dislikePost(UserProfile user){
        postLikes.remove(user.getUsername());
        disLikes.add(user.getUsername());
    }
}

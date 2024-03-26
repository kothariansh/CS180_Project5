import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Post {
    private String postContent;
    private Date postTimestamp;
    private String postID;
    private ArrayList<Comment> comments;
    private ArrayList<String> postLikes;
    public Post(String content){
        this.postContent = content;
        Date d1 = new Date();
        this.postTimestamp = d1;
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
    public ArrayList<Comment> getComments() {
        return comments;
    }
    public Date getPostTimestamp() {
        return postTimestamp;
    }

    public void deletePost(String postID){
        //similar implementation to deleteUser in UserProfile
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }
    public void deleteComment(Comment comment){
        comments.remove(comment);
    }
    public void likePost(UserProfile user){
        postLikes.add(user.getUsername());
    }
    public void unlikePost(UserProfile user){
        postLikes.remove(user.getUsername());
    }
}

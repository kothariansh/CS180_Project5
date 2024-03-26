import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Comment {
    private String commentID;
    private String commentContent;
    private Date commentTimestamp;
    private ArrayList<String> commentLikes;
    public Comment(String content){
        this.commentContent = content;
        Date d1 = new Date();
        this.commentTimestamp = d1;
        UUID uniqueID = UUID.randomUUID();
        this.commentID = uniqueID.toString();
    }
    public String getCommentID() {
        return commentID;
    }
    public String getCommentContent() {
        return commentContent;
    }
    public Date getCommentTimestamp() {
        return commentTimestamp;
    }
    public ArrayList<String> getCommentLikes() {
        return commentLikes;
    }
    public void likeComment(UserProfile user){
        commentLikes.add(user.getUsername());
    }
    public void unlikeComment(UserProfile user){
        commentLikes.remove(user.getUsername());
    }
}

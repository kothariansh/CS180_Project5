import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PostWrite  extends Post{
    public PostWrite(String content, UserProfile owner) {
        super(content, owner);
    }
    public void writePost() throws IOException {
        try {
            FileWriter fw = new FileWriter("Post.txt"); //change this
            PrintWriter pw = new PrintWriter(fw);
            pw.write(getPostID() + "," + getPostContent());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

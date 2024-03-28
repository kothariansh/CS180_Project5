import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessageWrite extends Message{
    public MessageWrite(String content, UserProfile user1, UserProfile user2) {
        super(content, user1, user2);
    }
    public void writeMessage() throws IOException {
        try {
            FileWriter fw = new FileWriter("Message.txt"); //change this
            PrintWriter pw = new PrintWriter(fw);
            pw.write(getMessageID() + "," + getContent());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

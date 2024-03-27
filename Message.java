import java.util.ArrayList;
import java.util.UUID;

public class Message {
    private String messageID;
    private UserProfile sender;
    private UserProfile receiver;
    private String content;
    private boolean read;
    private ArrayList<Message> inbox;
    public Message(String content, UserProfile user1, UserProfile user2){
        this.content = content;
        this.sender = user1;
        this.receiver = user2;
        UUID uniqueID = UUID.randomUUID();
        this.messageID = uniqueID.toString();
    }
    public String getContent() {
        return content;
    }
    public String getMessageID() {
        return messageID;
    }
    public UserProfile getSender() {
        return sender;
    }
    public UserProfile getReceiver() {
        return receiver;
    }
    public ArrayList<Message> getInbox() {
        return inbox;
    }
    public boolean markAsRead(){
        //code here to indicate if receiver has read the message
    }
}

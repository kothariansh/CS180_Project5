import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Message {
    private String messageID;
    private String sender;
    private String receiver;
    private String content;
    private Date timestamp;
    private boolean read;
    private ArrayList<Message> inbox;
    public Message(String content, UserProfile user1, UserProfile user2){
        this.content = content;
        this.sender = user1.getUsername();
        this.receiver = user2.getUsername();
        Date d1 = new Date();
        this.timestamp = d1;
        UUID uniqueID = UUID.randomUUID();
        this.messageID = uniqueID.toString();
    }
    public String getContent() {
        return content;
    }
    public String getMessageID() {
        return messageID;
    }
    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public ArrayList<Message> getInbox() {
        return inbox;
    }
    public void editMessage(String newMessage){
        //use get message ID to change this.content = newMessage
    }
    public void deleteMessage(String messageID, UserProfile user1, UserProfile user2){
        //maybe change this to UserProfile class
    }
    public void sendMessage(String messageID, UserProfile user1, UserProfile user2){
        //maybe change this to UserProfile class
    }
    public boolean markAsRead(){
        //code here to indicate if receiver has read the message
    }
}

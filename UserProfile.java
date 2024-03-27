import java.util.ArrayList;


public class UserProfile {
    private String username;
    private String password;
    private ArrayList<UserProfile> friends;
    private ArrayList<UserProfile> blockedUsers;
    private ArrayList<Post> posts;
    private String profilePictureLink;
    public UserProfile(String username, String password, String profilePictureLink){
        this.username = username;
        this.password = password;
        this.profilePictureLink = profilePictureLink;
        this.friends = null; //resets
        this.posts = null; //resets
    }
    //is registerUser works like constructor

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public ArrayList<Post> getPosts() {
        return posts;
    }
    public String getProfilePictureLink() {
        return profilePictureLink;
    }
    public ArrayList<UserProfile> getFriends() {
        return friends;
    }

    public boolean login(String username, String password){ //does login stuff username is not case-sensitive while password is
        if (this.username.equalsIgnoreCase(username) && this.password.equals(password)){
            return true;
        } else return false;
    }
    public void updatePic(String newProfilePictureLink){
        this.profilePictureLink = newProfilePictureLink;
    }
    public void updatePassword(String newPassword){
        this.password = newPassword;
    }
    public void addFriend(UserProfile friend){
        friends.add(friend);
    }
    public void removeFriend(UserProfile friend){
        friends.remove(friend);
    }
    public void blockUser(UserProfile user){
        removeFriend(user);
        blockedUsers.add(user);
    }
    public void sendMessage(String messageID, UserProfile user1, UserProfile user2){
        //maybe change this to UserProfile class
    }
}

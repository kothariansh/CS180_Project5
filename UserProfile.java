import java.util.ArrayList;
import java.util.Date;

public class UserProfile {
    private String username;
    private String password;
    private ArrayList<UserProfile> friends;
    private ArrayList<Post> posts;
    private String name;
    private String bio;
    private String profilePictureLink;
    private Date birthDate;
    public UserProfile(String username, String password, String name, String bio, String profilePictureLink, Date birthDate){
        this.username = username;
        this.password = password;
        this.name = name;
        this.bio = bio;
        this.profilePictureLink = profilePictureLink;
        this.birthDate = birthDate;
        this.friends = null; //resets
        this.posts = null; //resets
    }
    //is registerUser works like constructor

    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }
    public String getBio() {
        return bio;
    }
    public String getPassword() {
        return password;
    }
    public Date getBirthDate() {
        return birthDate;
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
    public void deleteUser(){
        //deletes person from platform as a whole
    }
    public void updateBio(String newBio){
        this.bio = newBio;
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
        //add code to disable user from recieving message from this user
    }
}

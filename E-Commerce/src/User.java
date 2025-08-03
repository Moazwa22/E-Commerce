public class User {
    protected int userId;
    protected String userName;
    protected String email;

    public User (int userId, String userName, String email){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }
    public String getUserDetails(){
        return ( "User : " + userName + " with email : " + email );
    }

}

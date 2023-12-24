package ua.edu.ucu.apps.Task1;

public class Auth {
    public User login(){
        int n = 0;
        if (n > 0){
            return new MyTwitterUser(new TwitterUser());
        }
        else{
            return new MyFacebookUser(new FacebookUser());
        }
    }

    public void processData(User user){
        String country = user.getCountry();
    }
}

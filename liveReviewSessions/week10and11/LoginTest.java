package week10and11;

public class LoginTest {
    public static void main(String[] args) {

    }

    public static boolean login(String username, String password){

        if(username.equalsIgnoreCase("cydeoStudent") && password.equalsIgnoreCase("cydeoPassword")){
            return true;
        }
        return false;
    }

 //   public static String login(String username, String password){ } NOT METHOD OVERLOADING

    public static boolean login(){
        if(getUsername().equalsIgnoreCase("cydeoStudent") && getPassword().equalsIgnoreCase("cydeoPassword")){
            return true;
        }
        return false;
    }

    public static String getPassword(){
        // assume that we are getting this piece of info from an external file
        return "cydeoPassword";
    }
    public static String getUsername(){
        return "cydeoStudent";
    }
}

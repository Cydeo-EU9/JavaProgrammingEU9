package week13;

public class Credentials {
    public String email = "oscar@cydeo.com";
    private String userName = "Scolfield";  // encapsulated fields
    private String passWord = "Cydeo123";

    public String getUserName(String emailInput){
        if(emailInput.equalsIgnoreCase(email)){
            return this.userName;
        }
        return "condition has NOT been satisfied";
    }

    public String getPassWord(String emailInput, String userNameInput){
        if(emailInput.equalsIgnoreCase(email)&&userNameInput.equalsIgnoreCase(userName)){
            return this.passWord;
        }
        return "condition has NOT been satisfied";
    }

    public void setPassWord(String newPassword){
        if(true) // you might have some kind of password condition
            this.passWord=newPassword;
      //  System.exit(-1); // other than zero means, some error happened
    }

}

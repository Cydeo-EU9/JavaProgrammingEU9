package week13;

public class Login {
    public static void main(String[] args) {
        Credentials user = new Credentials();  // new keyword using the default constructor

        System.out.println("user.email = " + user.email);

     //   System.out.println("user.userName = " + user.userName); // not reachable
     //   System.out.println("user = " + user.passWord); // not reachable

        System.out.println("user.getUserName(\"oscar@cydeo.com\") = " + user.getUserName("oscar@cydeo.com"));
        System.out.println("user.getPassWord(\"oscar@cydeo.com\",\"Scolfield\") = " + user.getPassWord("oscar@cydeo.com","Scolfield"));

       user.setPassWord("newPasswordforOscar");
        System.out.println("password after change = " + user.getPassWord("oscar@cydeo.com","Scolfield"));
    }
}

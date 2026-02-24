package oopsassignment;
import java.util.*;

interface Login {
    void authenticate(String user, String pass);
}

class UserLogin implements Login {
    public void authenticate(String user, String pass) {
        if(user.equals("admin") && pass.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");
    }
}

public class LoginTest {
    public static void main(String[] args) {
        Login l = new UserLogin();
        l.authenticate("admin", "1234");
    }
}

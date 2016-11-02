import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by Администратор on 30.10.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        controller.addUser(user1);
        controller.addUser(user2);
        controller.addUser(user3);

        controller.registerUser(user2);


    }
}

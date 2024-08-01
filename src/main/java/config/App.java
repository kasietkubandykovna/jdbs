package config;

import model.User;
import service.UserService;
import service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        UserService userService=new UserServiceImpl();
        userService.createUserTable();
        System.out.println(userService.saveUser(new User("Ulan","sdshd")));
    }
}

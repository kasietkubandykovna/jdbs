package service;

import dao.UserDao;
import dao.UserImpl;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

   private final  UserDao userDao= new UserImpl();

    @Override
    public void createUserTable() {
userDao.createUserTable();
    }

    @Override
    public String saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public String updateUser(Long userId, User user) {
        return "";
    }

    @Override
    public void deleteUser(Long userId) {

    }
}

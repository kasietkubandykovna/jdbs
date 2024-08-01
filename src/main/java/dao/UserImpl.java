package dao;

import config.DatebaseConfig;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserImpl implements UserDao{

    private final Connection connection= DatebaseConfig.getConnection();

    @Override
    public void createUserTable() {
        String sql=
                "CREATE TABLE if not exists  users ("
                + "id SERIAL PRIMARY KEY,"+
                "first_name varchar,"+
                "email varchar )";
        try{
Statement statement=connection.createStatement();
statement.executeUpdate(sql);

            System.out.println("Table successfully created");
    }catch(
    SQLException e){
        System.out.println(e.getMessage());
    }}

    @Override
    public String saveUser(User user) {
        String sql= """
        insert into users(first_name,email)
        values(?,?)
        """;
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
       preparedStatement.setString(1,user.getFirsName());
       preparedStatement.setString(2,user.getEmail());
preparedStatement.executeUpdate();
    }catch (SQLException e){
            System.out.println(e.getMessage());}
       return "Successfully saved";}


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

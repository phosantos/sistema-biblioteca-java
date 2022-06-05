package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Conector;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {

  Connection connection;

  public UserDAO() throws SQLException {
    connection = Conector.getConnection();
  }

  public boolean insertUser(User user) throws SQLException {
    String sql = "INSERT into user (nome,login,senha,cpf,verificaAdm) VALUES(?,?,?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, user.getName());
    statement.setString(2, user.getUsername());
    statement.setString(3, user.getPassword());
    statement.setString(4, user.getCpf());
    statement.setBoolean(5, user.getIsAdm());

    int rowsAdded = statement.executeUpdate();

    return (rowsAdded > 0);

  }

  public boolean updateUser(User user) throws SQLException {
    String sql = "UPDATE user set nome=?, login=?, senha=?, cpf=?, verificaAdm=? WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, user.getName());
    statement.setString(2, user.getUsername());
    statement.setString(3, user.getPassword());
    statement.setString(4, user.getCpf());
    statement.setBoolean(5, user.getIsAdm());
    statement.setInt(6, user.getId());

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  public boolean deleteUser(User user) throws SQLException {
    String sql = "DELETE from user WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setInt(1, user.getId());

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  // procura user no banco seguindo o type (cpf ou login) e retorna user;
  public User verifyUser(String type, String info) throws SQLException {
    String sql;

    if (type == "cpf") {
      sql = "SELECT * from user WHERE cpf=?";
    } else {
      sql = "SELECT * from user WHERE login=?";
    }

    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, info);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(6), result.getString(3),
          result.getString(4), result.getString(5));

      return user;
    } else {
      return null;
    }

  }

  public User findUserForLogin(String username, String password) throws SQLException {
    String sql = "SELECT * from user WHERE login=? and senha=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, username);
    statement.setString(2, password);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(6), result.getString(3),
          result.getString(4), result.getString(5));

      return user;
    } else {
      return null;
    }

  }

  public User findUser(String sql, String search) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, search);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(6), result.getString(3),
          result.getString(4), result.getString(5));

      return user;
    } else {
      return null;
    }

  }

  public List<User> findUsers(String sql) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    List<User> users = new ArrayList<>();

    while (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(6), result.getString(3),
          result.getString(4), result.getString(5));

      users.add(user);
    }

    return users;

  }

  public List<User> listUsers() throws SQLException {
    String sql = "SELECT * from user";
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    List<User> users = new ArrayList<>();

    while (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(6), result.getString(3),
          result.getString(4), result.getString(5));

      users.add(user);
    }

    return users;
  }

  public void close() throws SQLException {
    connection.close();
  }

}

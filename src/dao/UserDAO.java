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
    String sql = "INSERT into usuario (nome,cpf,telefone,email,login_usuario,senha,verificar_adm) VALUES(?,?,?,?,?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, user.getName());
    statement.setString(2, user.getCpf());
    statement.setString(3, user.getPhone());
    statement.setString(4, user.getEmail());
    statement.setString(5, user.getUsername());
    statement.setString(6, user.getPassword());
    statement.setBoolean(7, user.getIsAdm());

    int rowsAdded = statement.executeUpdate();

    return (rowsAdded > 0);

  }

  public boolean updateUser(User user) throws SQLException {
    String sql = "UPDATE usuario set nome=?, cpf=?, telefone=?, email=?, login_usuario=?, senha=?, verificar_adm=? WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, user.getName());
    statement.setString(2, user.getCpf());
    statement.setString(3, user.getPhone());
    statement.setString(4, user.getEmail());
    statement.setString(5, user.getUsername());
    statement.setString(6, user.getPassword());
    statement.setBoolean(7, user.getIsAdm());
    statement.setInt(8, user.getId());

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  public boolean deleteUser(int id) throws SQLException {
    String sql = "DELETE from usuario WHERE id=" + id;
    PreparedStatement statement = connection.prepareStatement(sql);

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  // procura user no banco seguindo o type (cpf ou login) e retorna user;
  public User verifyUser(String sql) throws SQLException {

    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(8), result.getString(6),
          result.getString(7), result.getString(3), result.getString(4), result.getString(5));

      return user;
    } else {
      return null;
    }

  }

  public User findUserForLogin(String username, String password) throws SQLException {
    String sql = "SELECT * from usuario WHERE login_usuario=? and senha=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, username);
    statement.setString(2, password);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(8), result.getString(6),
          result.getString(7), result.getString(3), result.getString(4), result.getString(5));

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
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(8), result.getString(6),
          result.getString(7), result.getString(3), result.getString(4), result.getString(5));

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
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(8), result.getString(6),
          result.getString(7), result.getString(3), result.getString(4), result.getString(5));

      users.add(user);
    }

    return users;

  }

  public List<User> listUsers() throws SQLException {
    String sql = "SELECT * from usuario";
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    List<User> users = new ArrayList<>();

    while (result.next()) {
      User user = new User(result.getInt(1), result.getString(2), result.getBoolean(8), result.getString(6),
          result.getString(7), result.getString(3), result.getString(4), result.getString(5));

      users.add(user);
    }

    return users;
  }

  public void close() throws SQLException {
    connection.close();
  }

}

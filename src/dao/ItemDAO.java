package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Conector;
import model.Item;

public class ItemDAO {

  Connection connection;

  public ItemDAO() throws SQLException {
    connection = Conector.getConnection();
  }

  public boolean insertItem(Item item) throws SQLException {
    String sql = "INSERT into item (titulo,autor,editora,categoria,descricao,anoPublicacao,disponivel) VALUES(?,?,?,?,?,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, item.getTitle());
    statement.setString(2, item.getAuthor());
    statement.setString(3, item.getPublisher());
    statement.setString(4, item.getKind());
    statement.setString(5, item.getDescription());
    statement.setInt(6, item.getPublicationYear());
    statement.setBoolean(7, item.getIsAvailable());

    int rowsUpdated = statement.executeUpdate();

    if (rowsUpdated > 0) {
      return true;
    } else {
      return false;
    }
  }

  public Item findItem(int id) throws SQLException {
    String sql = "SELECT * from item WHERE id=" + id;
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    Item item;

    if (result.next()) {
      item = new Item(result.getInt(1), result.getInt(7), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5), result.getString(6), result.getBoolean(8));

      return item;
    } else {
      return null;
    }

  }

  public boolean updateItem(Item item) throws SQLException {
    String sql = "UPDATE item set titulo=?, autor=?,editora=?,categoria=?,descricao=?,anoPublicacao=? WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, item.getTitle());
    statement.setString(2, item.getAuthor());
    statement.setString(3, item.getPublisher());
    statement.setString(4, item.getKind());
    statement.setString(5, item.getDescription());
    statement.setInt(6, item.getPublicationYear());
    statement.setInt(7, item.getId());

    int rowsUpdated = statement.executeUpdate();

    if (rowsUpdated > 0) {
      return true;
    } else {
      return false;
    }

  }

  public List<Item> listItems(String sql) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();

    List<Item> items = new ArrayList<>();

    while (result.next()) {
      Item item = new Item(result.getInt(1), result.getInt(7), result.getString(2), result.getString(3),
          result.getString(4), result.getString(5), result.getString(6), result.getBoolean(8));
      items.add(item);
    }

    return items;
  }

  public boolean deleteItem(int id) throws SQLException {
    String sql = "DELETE from item WHERE id=" + id;
    PreparedStatement statement = connection.prepareStatement(sql);
    int rowsAffected = statement.executeUpdate();

    return (rowsAffected > 0);
  }

  public void close() throws SQLException {
    connection.close();
  }

}

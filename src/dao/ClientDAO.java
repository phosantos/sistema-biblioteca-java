package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Conector;
import java.util.ArrayList;
import java.util.List;
import model.Client;

public class ClientDAO {

  Connection connection;

  public ClientDAO() throws SQLException {
    connection = Conector.getConnection();
  }

  public boolean insertClient(Client client) throws SQLException {
    String sql = "INSERT INTO cliente (nome, cpf, endereco, email) VALUES (?, ?, ?, ?)";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, client.getName());
    statement.setString(2, client.getCpf());
    statement.setString(3, client.getAddress());
    statement.setString(4, client.getEmail());

    int rowsReturned = statement.executeUpdate();

    return (rowsReturned > 0);

  }

  public boolean updateClient(Client client) throws SQLException {
    String sql = "UPDATE cliente set nome=?, idade=?, cpf=?, email=?, endereco=? WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, client.getName());
    statement.setString(2, client.getCpf());
    statement.setString(3, client.getEmail());
    statement.setString(4, client.getAddress());
    statement.setInt(5, client.getId());

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  public boolean deleteClient(int id) throws SQLException {
    String sql = "DELETE from cliente WHERE id=?";
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setInt(1, id);

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);

  }

  // procura cliente no banco pelo cpf;
  public Client verifyClientCpf(String cpf) throws SQLException {
    String sql = "SELECT * from cliente WHERE cpf=?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, cpf);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      Client cliente = new Client(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5));
      return cliente;
    } else {
      return null;
    }

  }

  public Client findClient(String sql, String search) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);

    statement.setString(1, search);

    ResultSet result = statement.executeQuery();

    if (result.next()) {
      Client client = new Client(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5));
      return client;
    } else {
      return null;
    }

  }

  public List<Client> findClients(String sql) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    List<Client> clients = new ArrayList<>();

    while (result.next()) {
      Client client = new Client(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5));

      clients.add(client);
    }

    return clients;

  }

  public List<Client> listClients(String sql) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet result = statement.executeQuery();

    List<Client> clients = new ArrayList<>();

    while (result.next()) {
      Client client = new Client(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5));

      clients.add(client);
    }

    return clients;
  }

  public Client findClientByCpf(String cpf) throws SQLException {
    String sql = "SELECT * from cliente WHERE cpf=?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, cpf);

    ResultSet result = statement.executeQuery();

    Client client;

    if (result.next()) {
      client = new Client(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
          result.getString(5));

      return client;
    } else {
      return null;
    }

  }

  public void close() throws SQLException {
    connection.close();
  }

}

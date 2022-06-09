package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.Conector;
import model.Loan;

public class LoanDAO {

  Connection connection;
  private Object[] joinTable2;

  public LoanDAO() throws SQLException {
    connection = Conector.getConnection();
  }

  public boolean insertLoan(Loan loan) throws SQLException {
    String sql = "INSERT into emprestimo (id_acervo, id_cliente, data_emprestimo, data_devolucao, devolvido) VALUES (?,?,STR_TO_DATE(?,'%d/%m/%Y'),STR_TO_DATE(?,'%d/%m/%Y'),?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1, loan.getId_item());
    statement.setInt(2, loan.getId_client());
    statement.setString(3, loan.getLoanDate());
    statement.setString(4, loan.getDevolutionDate());
    statement.setBoolean(5, loan.isReturned());

    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);
  }

  public boolean updateDateDevolutionLoan(int id_item, String date) throws SQLException {
    String sql = "UPDATE emprestimo set data_devolucao=STR_TO_DATE(?,'%d/%m/%Y') WHERE id_acervo=" + id_item;
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, date);
    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);
  }

  public boolean updateDevolutionStatus(int id_item) throws SQLException {
    String sql = "UPDATE emprestimo set devolvido=true WHERE id_acervo=" + id_item;
    PreparedStatement statement = connection.prepareStatement(sql);
    int rowsUpdated = statement.executeUpdate();

    return (rowsUpdated > 0);
  }

  // metodo pra formatar data
  private String formatarData(Date data) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return sdf.format(data);
  }

  public Object[] getJoinTable(String sql) throws SQLException {
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();

    if (result.next()) {
      Object[] joinTable = { result.getString(1), result.getString(2), result.getInt(3), result.getString(4),
          formatarData(result.getDate(5)), formatarData(result.getDate(6)) };

      return joinTable;
    } else {
      return null;
    }
  }

  public Loan findLoan(int id_item) throws SQLException {
    String sql = "SELECT * from emprestimo WHERE devolvido=true and id_acervo=" + id_item;
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();

    if (result.next()) {
      Loan loan = new Loan(result.getInt(1), result.getInt(3), result.getInt(2), result.getDate(4).toString(),
          result.getDate(5).toString(), result.getBoolean(6));

      return loan;
    } else {
      return null;
    }
  }

  public void close() throws SQLException {
    connection.close();
  }

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

  public List<Object[]> listLoanJoin() throws SQLException {
    String sql = "SELECT emprestimo.data_emprestimo, emprestimo.id, cliente.nome, cliente.cpf, acervo.titulo, emprestimo.data_devolucao from emprestimo inner join cliente on emprestimo.id_cliente=cliente.id inner join acervo on emprestimo.id_acervo=acervo.id ORDER BY emprestimo.data_emprestimo DESC, emprestimo.id DESC";
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet result = statement.executeQuery();
    List<Object[]> loanList = new ArrayList<>();

    while (result.next()) {
      Object[] joinTable = { formatarData(result.getDate(1)), result.getInt(2), result.getString(3),
          result.getString(4), result.getString(5), formatarData(result.getDate(6)) };
      loanList.add(joinTable);
    }

    return loanList;
  }

  public List<Object[]> listLoanDateFilter(String initialDate, String finalDate) throws SQLException {
    String sql = "SELECT emprestimo.id, emprestimo.data_emprestimo,  cliente.nome, cliente.cpf, acervo.titulo, emprestimo.data_devolucao from emprestimo inner join cliente on emprestimo.id_cliente=cliente.id inner join acervo on emprestimo.id_acervo=acervo.id WHERE emprestimo.data_emprestimo between STR_TO_DATE(?,'%d/%m/%Y') and STR_TO_DATE(?,'%d/%m/%Y') order by emprestimo.data_emprestimo";

    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, initialDate);
    statement.setString(2, finalDate);
    ResultSet result = statement.executeQuery();
    List<Object[]> loanList = new ArrayList<>();

    while (result.next()) {
      Object[] joinTable = { result.getInt(1), formatarData(result.getDate(2)), result.getString(3),
          result.getString(4), result.getString(5), formatarData(result.getDate(6)) };
      loanList.add(joinTable);
    }

    return loanList;
  }

  public void close() throws SQLException {
    connection.close();
  }

}

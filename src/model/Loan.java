package model;

import java.util.Date;

public class Loan {
  private int id;
  private int id_client;
  private int id_item;
  private String loanDate, devolutionDate;
  private boolean returned;

  public Loan(int id, int id_client, int id_item, String loanDate, String devolutionDate, boolean returned) {
    this.id = id;
    this.id_client = id_client;
    this.id_item = id_item;
    this.loanDate = loanDate;
    this.devolutionDate = devolutionDate;
    this.returned = returned;
  }

  public Loan(int id, int id_client, int id_item, String loanDate, String devolutionDate) {
    this.id = id;
    this.id_client = id_client;
    this.id_item = id_item;
    this.loanDate = loanDate;
    this.devolutionDate = devolutionDate;
    this.returned = false;
  }

  public Loan(int id_client, int id_item, String loanDate, String devolutionDate) {
    this.id_client = id_client;
    this.id_item = id_item;
    this.loanDate = loanDate;
    this.devolutionDate = devolutionDate;
    this.returned = false;
  }

  public int getId_client() {
    return id_client;
  }

  public void setId_client(int id_client) {
    this.id_client = id_client;
  }

  public int getId_item() {
    return id_item;
  }

  public void setId_item(int id_item) {
    this.id_item = id_item;
  }

  public boolean isReturned() {
    return returned;
  }

  public void setReturned(boolean returned) {
    this.returned = returned;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLoanDate() {
    return loanDate;
  }

  public void setLoanDate(String loanDate) {
    this.loanDate = loanDate;
  }

  public String getDevolutionDate() {
    return devolutionDate;
  }

  public void setDevolutionDate(String devolutionDate) {
    this.devolutionDate = devolutionDate;
  }

}

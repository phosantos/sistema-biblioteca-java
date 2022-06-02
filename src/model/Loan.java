package model;

import java.util.Date;

public class Loan {
  private int id;
  private Item item;
  private Client client;
  private Date loanDate, devolutionDate;

  public Loan(int id, Item item, Client client, Date loanDate, Date devolutionDate) {
    this.id = id;
    this.item = item;
    this.client = client;
    this.loanDate = loanDate;
    this.devolutionDate = devolutionDate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Date getLoanDate() {
    return loanDate;
  }

  public void setLoanDate(Date loanDate) {
    this.loanDate = loanDate;
  }

  public Date getDevolutionDate() {
    return devolutionDate;
  }

  public void setDevolutionDate(Date devolutionDate) {
    this.devolutionDate = devolutionDate;
  }

}

package model;

public class Client {
  private int id;
  private String name, cpf, address, email;

  public Client(int id, String name, String cpf, String address, String email) {
    this.id = id;
    this.name = name;
    this.cpf = cpf;
    this.address = address;
    this.email = email;
  }

  public Client(String name, String cpf, String address, String email) {
    this.name = name;
    this.cpf = cpf;
    this.address = address;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}

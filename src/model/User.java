package model;

public class User {

  private int id;
  private String name, username, password, cpf, phone, email;
  private boolean isAdm;

  public User(int id, String name, boolean isAdm, String username, String password, String cpf, String phone,
      String email) {
    this.id = id;
    this.name = name;
    this.isAdm = isAdm;
    this.username = username;
    this.password = password;
    this.cpf = cpf;
    this.phone = phone;
    this.email = email;
  }

  public User(String name, boolean isAdm, String username, String password, String cpf, String phone, String email) {
    this.name = name;
    this.isAdm = isAdm;
    this.username = username;
    this.password = password;
    this.cpf = cpf;
    this.phone = phone;
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
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

  public boolean getIsAdm() {
    return isAdm;
  }

  public void setIsAdm(boolean isAdm) {
    this.isAdm = isAdm;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
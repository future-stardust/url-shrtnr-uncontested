package edu.kpi.testcourse.bigtable;

public class Users {

  private String name;
  private String password;

  public Users(String name, String password) {
    this.name = name;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String toString() {
    return "Users{" +
      "name='" + name + '\'' +
      ", password='" + password + '\'' +
      '}';
  }
}

package edu.kpi.testcourse.bigtable;

//This root class is full of getters and setters

import java.util.List;

public class Root {

  private String login;
  private List<Users> users;

  public Root(String login, List<Users> users) {
    this.login = login;
    this.users = users;
  }

  public Root() {

  }

  public String getLogin() {
    return login;
  }

  public List<Users> getUsers() {
    return users;
  }

  @Override
  public String toString() {
    return "Root{" +
      "login='" + login + '\'' +
      ", users=" + users +
      '}';
  }

  public void setName(String name) {
  }
}

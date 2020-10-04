package com.company;

import java.util.Scanner;

public class Transport {

  private String privateField = "Transport private field";

  private final Scanner scanner = new Scanner(System.in);

  public Transport(String privateField) {
    this.privateField = privateField;
  }

  public Transport() {
  }

  protected String input() {
    return scanner.nextLine();
  }

  protected void output(String output) {
    System.out.println(output);
  }

  protected String getPrivateField() {
    return privateField;
  }

  public Integer getPrivateFieldLength() {
    return privateField.length();
  }

  public String getParentFinalField() {
    return privateField;
  }
}

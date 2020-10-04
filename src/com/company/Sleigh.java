package com.company;

public class Sleigh extends LoadedTransport {

  private final String privateField = "Sleigh private field";

  public Sleigh(String privateField) {
    super(privateField);
  }

  public Sleigh() {
  }

  public String getPrivateField() {
    return privateField;
  }

  @Override
  public Integer getPrivateFieldLength() {
    return privateField.length();
  }

  @Override
  public String getParentFinalField() {
    return super.getPrivateField();
  }
}

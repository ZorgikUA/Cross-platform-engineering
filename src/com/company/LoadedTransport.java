package com.company;

public class LoadedTransport extends Transport {

  private final String privateField = "LoadedTransport private field";

  public LoadedTransport(String privateField) {
    super(privateField);
  }

  public LoadedTransport() {
  }

  protected String getPrivateField() {
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

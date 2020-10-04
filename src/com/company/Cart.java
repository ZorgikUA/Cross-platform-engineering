package com.company;

public class Cart extends LoadedTransport {

  private final String privateField = "Cart private field";

  public Cart(String privateField) {
    super(privateField);
  }

  public Cart() {
  }

  public String getPrivateField() {
    return privateField;
  }

  @Override
  public String getParentFinalField() {
    return super.getPrivateField();
  }

  @Override
  public Integer getPrivateFieldLength() {
    return privateField.length();
  }
}

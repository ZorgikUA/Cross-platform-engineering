package com.company;

import java.util.Scanner;

public class CableTv implements MyInterface {
  private String title;
  private Integer amountOfChannels;
  private Integer pricePerMonth;

  private final Scanner scanner = new Scanner(System.in);

  public CableTv(String title, Integer amountOfChannels, Integer pricePerMonth) {
    this.title = title;
    this.amountOfChannels = amountOfChannels;
    this.pricePerMonth = pricePerMonth;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getAmountOfChannels() {
    return amountOfChannels;
  }

  public void setAmountOfChannels(Integer amountOfChannels) {
    this.amountOfChannels = amountOfChannels;
  }

  public Integer getPricePerMonth() {
    return pricePerMonth;
  }

  public void setPricePerMonth(Integer pricePerMonth) {
    this.pricePerMonth = pricePerMonth;
  }

  @Override
  public String input() {
    return scanner.nextLine();
  }

  @Override
  public void output() {
    System.out.println(toString());
  }

  @Override
  public Double method() {
    return (double) pricePerMonth / amountOfChannels;
  }

  @Override public String toString() {
    return "Средняя стоимость одного канала: " + method();
  }

  @Override
  public int hashCode() {
    return (int) Math.pow(amountOfChannels, 2d);
  }
}

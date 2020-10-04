package com.company;

import java.util.Scanner;

public class ElectroDevice implements MyInterface {
  private String name;
  private Double amperage;
  private Double voltage;

  private final Scanner scanner = new Scanner(System.in);

  public ElectroDevice(String name, Double amperage, Double voltage) {
    this.name = name;
    this.amperage = amperage;
    this.voltage = voltage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getAmperage() {
    return amperage;
  }

  public void setAmperage(Double amperage) {
    this.amperage = amperage;
  }

  public Double getVoltage() {
    return voltage;
  }

  public void setVoltage(Double voltage) {
    this.voltage = voltage;
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
    return amperage * voltage;
  }

  @Override public String toString() {
    return "Мощность прибора: " + method();
  }

  @Override
  public int hashCode() {
    return (int) Math.pow(amperage, 2d);
  }
}

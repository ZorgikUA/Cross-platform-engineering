package com.company;

import java.util.Scanner;

public class Tara {

  public static Scanner scanner = new Scanner(System.in);

  private String name;

  private Double width;

  private Double length;

  private Double height;

  public Tara(String name, Double width, Double length, Double height) {
    this.name = name;
    this.width = width;
    this.length = length;
    this.height = height;
  }

  public static String input() {
    return scanner.nextLine();
  }

  public static void output(String output) {
    System.out.println(output);
  }

  public Double getCapacity() {
    return width * length * height;
  }

  public String getName() {
    return name;
  }

  public Double getWidth() {
    return width;
  }

  public Double getLength() {
    return length;
  }

  public Double getHeight() {
    return height;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public void setHeight(Double height) {
    this.height = height;
  }
}

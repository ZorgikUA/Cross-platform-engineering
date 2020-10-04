package com.company;

import java.util.Scanner;

public class Vykl implements MyInterface {
  private String surname;
  private String jobTitle;
  private Integer amountOfDisciplines;
  private Integer amountOfHours;

  private final Scanner scanner = new Scanner(System.in);

  public Vykl(String surname, String jobTitle, Integer amountOfDisciplines, Integer amountOfHours) {
    this.surname = surname;
    this.jobTitle = jobTitle;
    this.amountOfDisciplines = amountOfDisciplines;
    this.amountOfHours = amountOfHours;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public void setAmountOfDisciplines(Integer amountOfDisciplines) {
    this.amountOfDisciplines = amountOfDisciplines;
  }

  public Integer getAmountOfHours() {
    return amountOfHours;
  }

  public void setAmountOfHours(Integer amountOfHours) {
    this.amountOfHours = amountOfHours;
  }

  public Integer getAmountOfDisciplines() {
    return amountOfDisciplines;
  }

  public Double averageAmountOfHours() {
    return (double) amountOfHours / amountOfDisciplines;
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
    return (double) amountOfHours / amountOfDisciplines;
  }

  @Override
  public String toString() {
    return "Среднее кол-во часов на дисциплину: " + method();
  }

  @Override
  public int hashCode() {
    return (int) Math.pow(amountOfDisciplines, 2d);
  }
}

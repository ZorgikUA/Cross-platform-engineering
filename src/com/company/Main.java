package com.company;

import java.util.Date;

public class Main {

  public static void main(String[] args) {
    a20();
    b20();
    c20();
    g20();
    additional20();
  }

  public static void a20() {
    int input = 1264;
    double value = Double.parseDouble(Double.toString(input).substring(2, 3));
    if ((value % 2) == 0) {
      System.out.println(Math.pow(value / 2, 2));
    }
  }

  public static void b20() {
    int n = 2;
    double a = 5;
    double b = 15;
    switch (n) {
    case 1:
      System.out.println(a + b);
      break;
    case 2:
      System.out.println(a - b);
      break;
    case 3:
      System.out.println(a * b);
      break;
    case 4:
      System.out.println(a / b);
      break;
    }
  }

  public static void c20() {
    int a = 3;
    int b = 4;
    int c = 5;
    if (Math.pow(c, 2) == (Math.pow(a,2) + Math.pow(b,2))) {
      System.out.println("Треугольник прямоугольный");
    }
    //с²=a²+b²
  }

  public static void g20() {
    Date first = new Date(2001, 06, 27);
    Date second = new Date(2002, 06, 27);

    if(first.compareTo(second) < 0) {
      System.out.println("Второй младше первого");
    } else if(first.compareTo(second) == 0){
      System.out.println("Одинаковые");
    } else {
      System.out.println("Первый младше второго");
    }

  }

  public static void additional20() {
    int n = 12345;
    char[] ch = Integer.toString(n).toCharArray();

    char temp = ch[0];
    ch[0] = ch[ch.length - 1];
    ch[ch.length - 1] = temp;

    System.out.println(ch);
  }
}

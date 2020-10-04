package com.company;

import java.util.ArrayDeque;

public class Main {

  public static void main(String[] args) {
    ArrayDeque<MyInterface> list = new ArrayDeque();
    list.add(new CableTv("title", 10, 15));
    list.add(new ElectroDevice("name", 3d, 110d));
    list.add(new Vykl("Surname", "Job Title", 3, 60));

    list.forEach(MyInterface::output);
  }
}

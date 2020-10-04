package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Transport> list = new ArrayList();
    list.add(new Transport());
    list.add(new LoadedTransport());
    list.add(new Cart());
    list.add(new Sleigh());

    list.forEach(transport -> {
      transport.output("Parent private field: " + transport.getParentFinalField() + " || Own private field: " +
          transport.getPrivateField() + " || Private field length: " + transport.getPrivateFieldLength());
    });
  }
}

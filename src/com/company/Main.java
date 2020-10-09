package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  private static final List<Product> list = new ArrayList<>();

  public static void main(String[] args) {
    list.add(new Product(1, "Name1", "Producer1", 1.0, new Date(2020, 1, 1), 1));
    list.add(new Product(2, "Name2", "Producer2", 2.0, new Date(2020, 2, 2), 2));
    list.add(new Product(3, "Name3", "Producer3", 3.0, new Date(2020, 3, 3), 3));
    list.add(new Product(4, "Name4", "Producer4", 4.0, new Date(2020, 4, 4), 4));
    list.add(new Product(5, "Name5", "Producer5", 5.0, new Date(2020, 5, 5), 5));
    list.add(new Product(6, "Name6", "Producer6", 6.0, new Date(2020, 6, 6), 6));

    System.out.println("Get by name");
    getByName("Name1").forEach(product -> System.out.println(product.toString()));
    System.out.println("Get by name and price");
    getByPriceAndName(3.0, "Name2").forEach(product -> System.out.println(product.toString()));
    System.out.println("Get by expiration date");
    getByExpirationDate(new Date(2020, 3, 3)).forEach(product -> System.out.println(product.toString()));
  }

  public static List<Product> getByName(String name) {
    return list.stream().filter(product -> product.getName().equals(name)).collect(Collectors.toList());
  }

  public static List<Product> getByPriceAndName(Double price, String name) {
    return list.stream().filter(product -> product.getName().equals(name))
        .filter(product -> product.getPrice() < price).collect(Collectors.toList());
  }

  public static List<Product> getByExpirationDate(Date expirationDate) {
    return list.stream().filter(product -> product.getExpirationDate().compareTo(expirationDate) > 0)
        .collect(Collectors.toList());
  }
}

package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static List<Tara> list = new LinkedList<>();

  public static void main(String[] args) {
    list.add(new Tara("name1", 1.0, 1.0, 1.0));
    list.add(new Tara("name2", 2.0, 2.0, 2.0));
    list.add(new Tara("name3", 3.0, 3.0, 3.0));

    System.out.println("Введите название тары");
    validate(Tara.input());
  }

  public static void validate(String name) {
    Tara tara = getByName(name);
    String result;
    if (tara == null) {
      result = "Tara не найдена";
    } else {
      Tara taraWithHighestCapacity = getByHighestCapacity();
      result = "Имя: " + tara.getName() + " " + "Обьем: " + tara.getCapacity() + "\nТара с найбольшшим обьемом \n"
          + "Имя: " + taraWithHighestCapacity.getName() + " Обьем: " + taraWithHighestCapacity.getCapacity();
    }

    Tara.output(result);
  }

  public static Tara getByName(String name) {
    return list.stream().filter(tara -> tara.getName().equals(name)).findFirst()
        .orElse(null);
  }

  public static Tara getByHighestCapacity() {
    return list.stream().max(Comparator.comparingDouble(Tara::getCapacity))
        .orElseThrow(() -> new RuntimeException("No elements found"));
  }
}

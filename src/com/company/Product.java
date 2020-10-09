package com.company;

import java.util.Date;

public class Product {
  private Integer id;
  private String name;
  private String producer;
  private Double price;
  private Date expirationDate;
  private Integer amount;

  public Product(Integer id, String name, String producer, Double price, Date expirationDate, Integer amount) {
    this.id = id;
    this.name = name;
    this.producer = producer;
    this.price = price;
    this.expirationDate = expirationDate;
    this.amount = amount;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", producer='" + producer + '\'' +
        ", price=" + price +
        ", expirationDate=" + expirationDate +
        ", amount=" + amount +
        '}';
  }
}

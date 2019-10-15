package com.example;

public interface InterfacePrivateMethod {

  private static String staticPrivateMethod() {
    return "Static private method";
  }

  private String privateMethod() {
    return "private method";
  }

  default void check() {
    System.out.println(privateMethod());
    System.out.println(staticPrivateMethod());
  }

}
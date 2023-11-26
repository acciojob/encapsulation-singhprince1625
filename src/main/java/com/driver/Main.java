package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();

    // obj.member = "Mohit Raj";
    // System.out.println(obj.member);

    obj.setMember("Mohit Raj");
    System.out.println(obj.getMember());
  }
}
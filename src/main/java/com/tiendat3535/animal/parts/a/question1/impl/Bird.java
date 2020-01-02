package com.tiendat3535.animal.parts.a.question1.impl;

import com.tiendat3535.animal.parts.a.question1.Flyable;
import com.tiendat3535.animal.parts.a.question1.Singable;

public class Bird extends Animal implements Flyable, Singable {

  @Override
  public void fly() {
    System.out.println("I am flying");
  }

  @Override
  public void sing() {
    System.out.println("I am singing");
  }
}

package com.tiendat3535.animal.parts.d.question1;

import com.tiendat3535.animal.parts.a.question1.Flyable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Butterfly extends Animal implements Flyable {
  @Override
  public void fly() {
    System.out.println("Butterfly is flying");
  }
}

package com.tiendat3535.animal.parts.b.question1;

import com.tiendat3535.animal.parts.a.question1.Swimmable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Fish extends Animal implements Swimmable {
  @Override
  public void swim() {
    System.out.println("Fish is swimming");
  }
}

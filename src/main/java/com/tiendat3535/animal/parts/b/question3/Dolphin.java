package com.tiendat3535.animal.parts.b.question3;

import com.tiendat3535.animal.parts.a.question1.Swimmable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Dolphin extends Animal implements Swimmable {

  @Override
  public void swim() {
    System.out.println("Dolphin is swimming");
  }

}

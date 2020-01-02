package com.tiendat3535.animal.parts.a.question2;

import com.tiendat3535.animal.parts.a.question1.Speakable;
import com.tiendat3535.animal.parts.a.question1.Walkable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Chicken extends Animal implements Speakable, Walkable {
  @Override
  public void speak() {
    System.out.println("Cluck, cluck");
  }

  @Override
  public void walk() {
    System.out.println("Chicken is walking");
  }
}
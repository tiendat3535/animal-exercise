package com.tiendat3535.animal.parts.a.question2;

import com.tiendat3535.animal.parts.a.question1.Speakable;
import com.tiendat3535.animal.parts.a.question1.Swimmable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Duck extends Animal implements Swimmable, Speakable {

  @Override
  public void swim() {
    System.out.println("I am swimming");
  }

  @Override
  public void speak() {
    System.out.println("Quack, quack");
  }
}

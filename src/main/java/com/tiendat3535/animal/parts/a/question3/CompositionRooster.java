package com.tiendat3535.animal.parts.a.question3;

import com.tiendat3535.animal.parts.a.question2.Chicken;

public class CompositionRooster {

  private Chicken chicken = new Chicken();

  void speak() {
    System.out.println("Cock-a-doodle-doo");
  }

  void walk() {
    chicken.walk();
  }
}

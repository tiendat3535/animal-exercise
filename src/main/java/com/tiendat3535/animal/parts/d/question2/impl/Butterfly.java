package com.tiendat3535.animal.parts.d.question2.impl;

import com.tiendat3535.animal.parts.a.question1.impl.Animal;
import com.tiendat3535.animal.parts.d.question2.Insect;

public class Butterfly extends Animal implements Insect {

  private Insect state = new MetamorphosisForm();

  public void transform() {
    state = new ButterflyForm();
  }
  @Override
  public void fly() {
    state.fly();
  }

  @Override
  public void walk() {
    state.walk();
  }
}


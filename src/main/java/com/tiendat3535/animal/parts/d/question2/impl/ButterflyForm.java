package com.tiendat3535.animal.parts.d.question2.impl;

import com.tiendat3535.animal.parts.d.question2.Insect;

public class ButterflyForm implements Insect {
  @Override
  public void fly() {
    System.out.println("Butterfly is flying");
  }

  @Override
  public void walk() {
    // Butterfly can not walk
  }
}

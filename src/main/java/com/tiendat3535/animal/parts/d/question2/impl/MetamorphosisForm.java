package com.tiendat3535.animal.parts.d.question2.impl;

import com.tiendat3535.animal.parts.d.question2.Insect;

public class MetamorphosisForm implements Insect {

  @Override
  public void walk() {
    System.out.println("MetamorphosisForm is walking");
  }

  @Override
  public void fly() {
    // MetamorphosisForm can not fly
  }
}

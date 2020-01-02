package com.tiendat3535.animal.parts.b.question2;

import com.tiendat3535.animal.parts.b.question1.Fish;
import com.tiendat3535.animal.parts.b.question2.enums.Size;

public class Clownfish extends Fish {

  public Size size() {
    return Size.SMALL;
  }

  public String color() {
    return "#FFA500";
  }

  public void makeJokes() {
    System.out.println("Clownfish is making jokes");
  }
}

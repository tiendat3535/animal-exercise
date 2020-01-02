package com.tiendat3535.animal.parts.b.question2;

import com.tiendat3535.animal.parts.b.question1.Fish;
import com.tiendat3535.animal.parts.b.question2.enums.Size;

import java.util.List;

public class Shark extends Fish {
  public Size size() {
    return Size.LARGER;
  }

  public String color() {
    return "#DCDCDC";
  }

  public void eatFishes(List<Fish> fishes) {
    for (Fish fish: fishes) {
      System.out.println(String.format("Eat fish: %s", fish.getClass().getSimpleName()));
    }
  }
}

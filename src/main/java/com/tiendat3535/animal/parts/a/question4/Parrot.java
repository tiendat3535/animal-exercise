package com.tiendat3535.animal.parts.a.question4;

import com.tiendat3535.animal.parts.a.question1.Speakable;
import com.tiendat3535.animal.parts.a.question1.impl.Animal;

public class Parrot extends Animal implements Speakable {

  private Runnable speak;

  public Parrot(final Runnable speak) {
    this.speak = speak;
  }

  public void mimic(final Runnable speak) {
    this.speak = speak;
  }

  @Override
  public void speak() {
    this.speak.run();
  }
}

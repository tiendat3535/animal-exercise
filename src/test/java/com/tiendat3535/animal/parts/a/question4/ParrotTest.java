package com.tiendat3535.animal.parts.a.question4;

import com.tiendat3535.animal.parts.BaseTest;
import com.tiendat3535.animal.parts.a.question1.impl.Bird;
import com.tiendat3535.animal.parts.a.question3.InheritanceRooster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest extends BaseTest {

  @Test
  void mimic() {
    // Given
    final Bird bird = new Bird();
    final Parrot parrot = new Parrot(bird::sing);
    parrot.mimic(() -> System.out.println("Mimic"));

    // When
    parrot.speak();

    // Then
    assertEquals("Mimic\n", outContent.toString());
  }

  @Test
  void speak() {
    // Given
    final Bird bird = new Bird();
    final Parrot parrot = new Parrot(bird::sing);

    // When
    parrot.speak();

    // Then
    assertEquals("I am singing\n", outContent.toString());
  }
}
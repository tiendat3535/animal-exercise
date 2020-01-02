package com.tiendat3535.animal.parts.a.question2;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest extends BaseTest {

  @Test
  void swim() {
    // Given
    final Duck duck = new Duck();

    // When
    duck.swim();

    // Then
    assertEquals("I am swimming\n", outContent.toString());
  }

  @Test
  void speak() {
    // Given
    final Duck duck = new Duck();

    // When
    duck.speak();

    // Then
    assertEquals("Quack, quack\n", outContent.toString());
  }
}
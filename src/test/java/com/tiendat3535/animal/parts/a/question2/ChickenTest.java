package com.tiendat3535.animal.parts.a.question2;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest extends BaseTest {

  @Test
  void chickenCanSpeak() {
    // Given
    final Chicken chicken = new Chicken();

    // When
    chicken.speak();

    // Then
    assertEquals("Cluck, cluck\n", outContent.toString());
  }

  @Test
  void walk() {
    // Given
    final Chicken chicken = new Chicken();

    // When
    chicken.walk();

    // Then
    assertEquals("Chicken is walking\n", outContent.toString());
  }
}
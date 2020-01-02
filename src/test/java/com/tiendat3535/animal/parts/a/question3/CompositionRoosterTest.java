package com.tiendat3535.animal.parts.a.question3;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositionRoosterTest extends BaseTest {

  @Test
  void speak() {
    // Given
    final CompositionRooster compositionRooster = new CompositionRooster();

    // When
    compositionRooster.speak();

    // Then
    assertEquals("Cock-a-doodle-doo\n", outContent.toString());
  }

  @Test
  void walk() {
    // Given
    final CompositionRooster compositionRooster = new CompositionRooster();

    // When
    compositionRooster.walk();

    // Then
    assertEquals("Chicken is walking\n", outContent.toString());
  }
}
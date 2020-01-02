package com.tiendat3535.animal.parts.a.question3;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceRoosterTest extends BaseTest {

  @Test
  void speak() {
    // Given
    final InheritanceRooster inheritanceRooster = new InheritanceRooster();

    // When
    inheritanceRooster.speak();

    // Then
    assertEquals("Cock-a-doodle-doo\n", outContent.toString());
  }
}
package com.tiendat3535.animal.parts.b.question2;

import com.tiendat3535.animal.parts.BaseTest;
import com.tiendat3535.animal.parts.b.question2.enums.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClownfishTest extends BaseTest {

  @Test
  void size() {
    // Given
    final Clownfish clownfish = new Clownfish();

    // When
    final Size size = clownfish.size();

    // Then
    assertEquals(Size.SMALL, size);
  }

  @Test
  void color() {
    // Given
    final Clownfish clownfish = new Clownfish();

    // When
    final String color = clownfish.color();

    // Then
    assertEquals("#FFA500", color);
  }

  @Test
  void makeJokes() {
    // Given
    final Clownfish clownfish = new Clownfish();

    // When
    clownfish.makeJokes();

    // Then
    assertEquals("Clownfish is making jokes\n", outContent.toString());
  }
}
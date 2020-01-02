package com.tiendat3535.animal.parts.a.question1.impl;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest extends BaseTest {

  @Test
  void testBirdCanFly() {
    // Given
    final Bird bird = new Bird();

    // When
    bird.fly();

    // Then
    assertEquals("I am flying\n", outContent.toString());
  }

  @Test
  void testBirdCanSing() {
    // Given
    final Bird bird = new Bird();

    // When
    bird.sing();

    // Then
    assertEquals("I am singing\n", outContent.toString());
  }

}
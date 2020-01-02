package com.tiendat3535.animal.parts.a.question1.impl;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest extends BaseTest {

  @Test
  void testAnimalCanEat() {
    // Given
    final Animal animal = new Animal();

    // When
    animal.eat();

    // Then
    assertEquals("I am eating\n", outContent.toString());
  }

}
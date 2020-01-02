package com.tiendat3535.animal.parts.d.question2.impl;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest extends BaseTest {

  @Test
  void testFly() {
    // Given
    Butterfly butterfly = new Butterfly();

    // When
    butterfly.transform();
    butterfly.fly();
    butterfly.walk();

    // Then
    assertEquals("Butterfly is flying\n", outContent.toString());
  }

  @Test
  void testWalk() {
    // Given
    Butterfly butterfly = new Butterfly();

    // When
    butterfly.fly();
    butterfly.walk();

    // Then
    assertEquals("MetamorphosisForm is walking\n", outContent.toString());
  }
}
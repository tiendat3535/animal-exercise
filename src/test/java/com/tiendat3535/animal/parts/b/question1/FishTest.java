package com.tiendat3535.animal.parts.b.question1;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest  extends BaseTest {

  @Test
  void swim() {
    // Given
    final Fish fish = new Fish();

    // When
    fish.swim();

    // Then
    assertEquals("Fish is swimming\n", outContent.toString());
  }
}
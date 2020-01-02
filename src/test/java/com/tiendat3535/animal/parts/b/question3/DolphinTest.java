package com.tiendat3535.animal.parts.b.question3;

import com.tiendat3535.animal.parts.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DolphinTest extends BaseTest {

  @Test
  void testSwim() {
    // Given
    final Dolphin dolphin = new Dolphin();

    // When
    dolphin.swim();

    // Then
    assertEquals("Dolphin is swimming\n", outContent.toString());
  }
}
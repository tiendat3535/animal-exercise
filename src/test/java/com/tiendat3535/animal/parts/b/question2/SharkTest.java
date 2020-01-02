package com.tiendat3535.animal.parts.b.question2;

import com.tiendat3535.animal.parts.BaseTest;
import com.tiendat3535.animal.parts.b.question1.Fish;
import com.tiendat3535.animal.parts.b.question2.enums.Size;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharkTest extends BaseTest {

  @Test
  void testSize() {
    // Given
    final Shark shark = new Shark();

    // When
    final Size size = shark.size();

    // Then
    assertEquals(Size.LARGER, size);
  }

  @Test
  void testColor() {
    // Given
    final Shark shark = new Shark();

    // When
    final String color = shark.color();

    // Then
    assertEquals("#DCDCDC", color);
  }

  @Test
  void testAatFishes() {
    // Given
    final Shark shark = new Shark();
    List<Fish> animals = new ArrayList<>();
    animals.add(new Clownfish());

    // When
    shark.eatFishes(animals);

    // Then
    assertEquals("Eat fish: Clownfish\n", outContent.toString());
  }
}
package com.tiendat3535.animal.parts.e;

import com.tiendat3535.animal.parts.a.question1.impl.Animal;
import com.tiendat3535.animal.parts.a.question1.impl.Bird;
import com.tiendat3535.animal.parts.a.question2.Chicken;
import com.tiendat3535.animal.parts.a.question2.Duck;
import com.tiendat3535.animal.parts.a.question3.InheritanceRooster;
import com.tiendat3535.animal.parts.a.question4.Parrot;
import com.tiendat3535.animal.parts.b.question1.Fish;
import com.tiendat3535.animal.parts.b.question2.Clownfish;
import com.tiendat3535.animal.parts.b.question2.Shark;
import com.tiendat3535.animal.parts.b.question3.Dolphin;
import com.tiendat3535.animal.parts.d.question1.Butterfly;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalStatisticTest {

  @Test
  void testStatistic() {
    // Given
    List<Animal> animals = Lists.list(
      new Bird(),
          new Duck(),
          new Chicken(),
          new InheritanceRooster(),
          new Parrot(() -> System.out.println("Parrot is speaking")),
          new Fish(),
          new Shark(),
          new Clownfish(),
          new Dolphin(),
          new Butterfly());
    Map<String, Integer> expectedStatistic = new HashMap<>();
    expectedStatistic.put("Singable", 1);
    expectedStatistic.put("Swimmable", 5);
    expectedStatistic.put("Flyable", 2);
    expectedStatistic.put("Walkable", 2);

    // When
    Map<String, Integer> statistic = AnimalStatistic.getStatistic(animals);

    // Then
    assertEquals(expectedStatistic, statistic);

  }
}
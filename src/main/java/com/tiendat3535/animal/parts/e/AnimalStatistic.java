package com.tiendat3535.animal.parts.e;

import com.tiendat3535.animal.parts.a.question1.impl.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AnimalStatistic {

  public static Map<String, Integer> getStatistic(List<Animal> animals) {
    final Map<String, Class<?>> mapping = StatisticPropertiesMapping.getMapping();
    final Map<String, Integer> statistic = new HashMap<>();
    for (Animal animal: animals) {
      for (Map.Entry<String, Class<?>> entry: mapping.entrySet()) {
        if (entry.getValue().isInstance(animal)) {
          final Integer statisticValue = statistic.get(entry.getKey());
          final Integer updatedStatisticValue = Objects.nonNull(statisticValue) ? statisticValue + 1 : 1;
          statistic.put(entry.getKey(), updatedStatisticValue);
        }
      }
    }
    return statistic;
  }
}

package com.tiendat3535.animal.parts.e;

import com.tiendat3535.animal.parts.a.question1.Flyable;
import com.tiendat3535.animal.parts.a.question1.Singable;
import com.tiendat3535.animal.parts.a.question1.Swimmable;
import com.tiendat3535.animal.parts.a.question1.Walkable;

import java.util.HashMap;
import java.util.Map;

public class StatisticPropertiesMapping {

  private static final Map<String, Class<?>> mapping;

  static {
    mapping = new HashMap<>();
    mapping.put("Flyable", Flyable.class);
    mapping.put("Walkable", Walkable.class);
    mapping.put("Swimmable", Swimmable.class);
    mapping.put("Singable", Singable.class);
  }

  public static Map<String, Class<?>> getMapping() {
    return mapping;
  }
}

package uk.gov.ons.concourse_demo_service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AnimalService {

  Map<String, String> animals;

  public AnimalService() {
    animals = new HashMap<String, String>();
    animals.put("c", "Cat");
    animals.put("d", "Dog");
    animals.put("s", "Snake");
  }

  public String getForLetter(String letter) throws AnimalNotFound {
    if (!animals.containsKey(letter))
      throw new AnimalNotFound();

    return animals.get(letter);
  }
}

package uk.gov.ons.concourse_demo_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController

public class AnimalController {
  private AnimalService animalService;

  @Autowired
  public AnimalController(AnimalService animalService) {

    this.animalService = animalService;
  }

  @RequestMapping(value = "/animal/{letter}", method = RequestMethod.GET)
  public @ResponseBody
  String animal(@PathVariable("letter") String letter) throws AnimalNotFound {
    return animalService.getForLetter(letter);
  }

  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ExceptionHandler(AnimalNotFound.class)
  public void notFound() {
  }

}

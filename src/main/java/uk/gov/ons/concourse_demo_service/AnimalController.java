package uk.gov.ons.concourse_demo_service;

import org.springframework.web.bind.annotation.*;

@RestController

public class AnimalController {

  @RequestMapping(value = "/animal/{letter}", method = RequestMethod.GET)
  public @ResponseBody String animal(@PathVariable("letter") String letter){
    return "Rabbit";
  }

}

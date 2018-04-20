package uk.gov.ons.concourse_demo_service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class AnimalServiceTest {

  private AnimalService animalService;

  @Before
  public void setUp() {
    animalService = new AnimalService();
  }

  @Test
  public void testReturnsCatForC() throws AnimalNotFound {
    assertThat(animalService.getForLetter("c")).isEqualTo("Cat");
  }

  @Test
  public void testReturnsDogForD() throws AnimalNotFound {
    assertThat(animalService.getForLetter("d")).isEqualTo("Dog");
  }

  @Test
  public void testReturnsSnakeForS() throws AnimalNotFound {
    assertThat(animalService.getForLetter("s")).isEqualTo("Snake");
  }

  @Test(expected = AnimalNotFound.class)
  public void testThrowsAnimalNotFound() throws AnimalNotFound {
    animalService.getForLetter("q");
  }
}
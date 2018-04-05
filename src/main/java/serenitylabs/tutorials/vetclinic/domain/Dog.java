package serenitylabs.tutorials.vetclinic.domain;
import java.time.LocalDateTime;

/**
 * @author Pashmina Tiwari
 */
public class Dog
{
  private final String name;
  private final String breed;
  private final LocalDateTime dateOfBirth;
  private final String favouriteFood;
  private final String colour;
  private final String toy;

  protected Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood, String colour, String toy)
  {
    this.name= name;
    this.breed=breed;
    this.dateOfBirth=dateOfBirth;
    this.favouriteFood= favouriteFood;
    this.colour=colour;
    this.toy=toy;
  }
  public static WithBreed called(String name)
  {
    return new DogBuilder(name);
  }
  public String getName()
  {
    return name;
  }
  public String getBreed()
  {
    return breed;
  }
  public LocalDateTime geDateOfBirth()
  {
    return dateOfBirth;
  }
  public String getFavoriteFood()
  {
    return favouriteFood;
  }
  public String getColour()
  {
    return colour;
  }
  public String getFavouriteToy()
  {
    return toy;
  }
}

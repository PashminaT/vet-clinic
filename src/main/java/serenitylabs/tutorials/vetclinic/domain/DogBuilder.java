package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

/**
 * @author Pashmina Tiwari
 */
public class DogBuilder implements WithBreed, ofColour
{
  private String name;
  private String breed;
  private LocalDateTime birthday;
  private String favouriteFood;
  private String colour;
  private String toy;
  public DogBuilder(String name){

    this.name = name;
  }
  public DogBuilder ofBreed(String breed)
  {
    this.breed = breed;
    return this;
  }
  public Dog bornOn(LocalDateTime birthday)
  {
    this.birthday = birthday;
    return  new Dog(name, breed, birthday, favouriteFood, colour, toy);
  }
  public DogBuilder withFavouriteFood(String favouriteFood)
  {
    this.favouriteFood = favouriteFood;
    return this;
  }
  public DogBuilder ofColour(String colour)
  {
    this.colour = colour;
    return this;
  }
  public DogBuilder withFavouriteToy(String toy)
  {
    this.toy=toy;
    return this;
  }
}

interface WithBreed
{
  ofColour ofBreed(String breed);
}

interface ofColour
{
  DogBuilder ofColour(String colour);
}

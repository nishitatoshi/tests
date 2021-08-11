package com.techment.test1;

class Animal
{
	void sound()
	{
		System.out.println("animal sounds");
		
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("bark");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("mewo");
	}
}
class Horse extends Animal
{
	void neeh()
	{
		System.out.println("neeh");
	}
}

public class AnimalSound {

	public static void main(String[] args) 
	{
	    Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Horse horse = new Horse();
	    animal.sound();
	    dog.bark();
	    cat.meow();
	    horse.neeh();
	    

	}
}

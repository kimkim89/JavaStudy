package day3;

class Animal{}

class Cat extends Animal{}

class Dog{}

public class InstanceofTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		System.out.println(animal instanceof Animal); 	//true
		System.out.println(cat instanceof Animal);	//true
		System.out.println(animal instanceof Cat);	//false
		System.out.println(cat instanceof Cat);		//true
		//System.out.println(dog instanceof Cat);		//Error: Cat은 Dog의 상위클래스도 아니고 하위클래스도 아니라서 
	}
}

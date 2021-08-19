package day9;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal; //ClassCastException 발생 가능
		/*  
		 	animal에 cat 객체가 저장된 후 Dog타입으로 형변환이 될 수 없어서 ClassCastException 발생
		 */
		}else {
			System.out.println("Cat객체는 Dog타입으로 변환 안됨");
		}
	}
}


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
package _01_AnimalFarm;

public abstract class Animal {
	abstract void makeNoise();
	abstract void eat();
	

}

class Pig extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("oink");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("bacon");
	}

}

class Cow extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("moo");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("beef");
	}

}

class Chicken extends Animal {

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("idk chicken noises");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("McNuggets");
	}

}

class Sheep extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("baa? idk");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("whatever sheep meat is called");
	}

}
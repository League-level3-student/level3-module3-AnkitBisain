package _01_AnimalFarm;

import java.util.ArrayList;

import _01_AnimalFarm.Animal;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Pig pig1 = new Pig();
		Cow cow1 = new Cow();
		Sheep sheep1 = new Sheep();
		Chicken chicken1 = new Chicken();
		Pig pig2 = new Pig();
		Cow cow2 = new Cow();
		farm.add(pig1);
		farm.add(cow1);
		farm.add(sheep1);
		farm.add(chicken1);
		farm.add(pig2);
		farm.add(cow2);
		for(int i = 0; i<6; i++) {
			farm.get(i).eat();
			farm.get(i).makeNoise();
		}
	}
}

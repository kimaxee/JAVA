package q049;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat("고양이", "야옹"));
		animals.add(new Snake("뱀", "쉬이익"));
		animals.add(new Hawk("매", "끼요오"));
		
		for(Animal a : animals) { //향상된 for문
			System.out.println("이름 : " + a.name + " / 울음소리 : " + a.cry);
		}
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println("이름 : " + animals.get(i).name);
			animals.get(i).sound();
			animals.get(i).move();
		}
		
	}
}

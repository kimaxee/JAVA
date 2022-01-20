package q037;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("개");
		testArrayList.add("고양이");
		testArrayList.add("너굴맨");

		// case 1
		for (int i = 0; i < testArrayList.size(); i++) {
			System.out.println(testArrayList.get(i));
		}

		// case 2
		for (String s : testArrayList) {
			System.out.println(s);
		}

		testArrayList.remove(0); // index 0 삭제

		System.out.println("개 삭제함");

		// case 1
		for (int i = 0; i < testArrayList.size(); i++) {
			System.out.println(testArrayList.get(i));
		}

		// case 2
		for (String s : testArrayList) {
			System.out.println(s);
		}

		boolean hasCat = testArrayList.contains("고양이"); // 고양이가 있는지 확인
		System.out.println("고양이있나? :" + hasCat);

		boolean hasDog = testArrayList.contains("개"); // 개가 있는지 확인
		System.out.println("개 있나? :" + hasDog);
	}
}
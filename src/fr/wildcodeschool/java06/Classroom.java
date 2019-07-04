package fr.wildcodeschool.java06;

public class Classroom {

	public static void main(String[] args) {
		Wilder Julien = new Wilder("Julien", false);
		Wilder Marilou = new Wilder("Marilou", true);
		Wilder Genia = new Wilder("Genia", true);
		Wilder Sandrine = new Wilder("Sandrine", true);

		System.out.println(Julien.whoAmI());
		System.out.println(Marilou.whoAmI());
		System.out.println(Genia.whoAmI());
		System.out.println(Sandrine.whoAmI());
	}

}

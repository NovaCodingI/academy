package chapter07.exam0301;

public class SoundableExample {
	
	private static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
	}

		
	}


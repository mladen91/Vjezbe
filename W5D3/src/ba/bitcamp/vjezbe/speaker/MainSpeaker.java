package ba.bitcamp.vjezbe.speaker;

public class MainSpeaker {

	public static void main(String[] args) {
		//Creating speaker
		Speaker s1=new Speaker("LG Sound System", 96, 50);
		//Increase speaker volume
		s1.increaseVolume();
		//s1.disable(); - if we want to disable speaker
		s1.increaseVolume();
		s1.increaseVolume();
		System.out.println(s1);

	}

}

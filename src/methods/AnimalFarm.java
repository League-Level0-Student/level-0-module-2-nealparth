package methods;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	private Object Cow = null;

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for (int i = 0; i < 5; i++) {
			String animal = JOptionPane.showInputDialog("Which animal do you want");

			if (animal.equals("cow")) {
				playMoo();
			} else if (animal.equals("duck")) {
				playQuack();
			} else if (animal.equals("dog")) {
				playWoof();
			} else if (animal.equals("cat")) {
				playMeow();
			} else if (animal.equals("llama")) {
				playllama();
			} else
				JOptionPane.showMessageDialog(null, "GO HOME");
		}

		/* 2. Make it so that the user can keep entering new animals. */

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playllama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}

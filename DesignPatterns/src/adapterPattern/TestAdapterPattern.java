package adapterPattern;

public class TestAdapterPattern {

	public static void main(String[] args) {
		MediaPlayer mp = new AudioPlayer();
		mp.play("mp4", "f1");
		mp.play("vlc", "f2");
		mp.play("mp3", "f3");
		mp.play("mpp", "f4");

	}

}

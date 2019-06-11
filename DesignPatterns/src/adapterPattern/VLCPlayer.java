package adapterPattern;

public class VLCPlayer implements AdvancedMediaPlayer {

	public void playVLC(String fname) {
		System.out.println("playing VLC file " + fname);
	}

	public void playMP4(String fname) {
		// do nothing

	}

}

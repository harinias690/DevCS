package adapterPattern;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer amp;

	public MediaAdapter(String format) {
		if (format.equalsIgnoreCase("vlc")) {
			amp = new VLCPlayer();
		} else {
			amp = new MP4Player();
		}
	}

	public void play(String format, String fname) {
		if (format.equalsIgnoreCase("vlc")) {
			amp.playVLC(fname);
		} else {
			amp.playMP4(fname);
		}

	}
}

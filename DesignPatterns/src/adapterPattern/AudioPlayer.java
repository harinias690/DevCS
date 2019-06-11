package adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter ma;

	public void play(String format, String fname) {

		if (format.equalsIgnoreCase("mp3")) {
			System.out.println("playing " + format + " file :" + fname);
		} else if (format.equalsIgnoreCase("vlc")
				|| format.equalsIgnoreCase("mp4")) {
			ma = new MediaAdapter(format);
			ma.play(format, fname);
		} else {
			System.out.println("invalid format requested");
		}

	}

}

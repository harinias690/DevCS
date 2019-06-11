package adapterPattern;

public class MP4Player implements AdvancedMediaPlayer  {

	public void playVLC(String fname) {
		// do nothing
		
	}

	public void playMP4(String fname) {
		System.out.println("playing mp4 file " + fname);
		
	}

}

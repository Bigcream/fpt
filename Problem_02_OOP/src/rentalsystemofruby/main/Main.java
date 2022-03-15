package rentalsystemofruby.main;

import javax.inject.Inject;

import rentalsystemofruby.db.IVideoDb;
import rentalsystemofruby.db.impl.VideoDb;
import rentalsystemofruby.dto.Video;

public class Main {
	

	public static IVideoDb videoDb = (IVideoDb) new VideoDb();
	
	public static void main(String[] args) {
		Video video = new Video();
//		video.inputInfo();
//		videoDb.save(video);
		video = videoDb.findOne(5l);
		String string = video.getDescription();
		System.out.println(string);
	}

}

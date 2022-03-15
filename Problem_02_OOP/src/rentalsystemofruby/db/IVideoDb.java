package rentalsystemofruby.db;

import rentalsystemofruby.dto.Video;

public interface IVideoDb extends IGenericDb<Video> {
	Long save(Video video);
	Video findOne(Long seriNumber);
}

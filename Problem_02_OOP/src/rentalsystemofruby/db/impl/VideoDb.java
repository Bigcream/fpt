package rentalsystemofruby.db.impl;

import java.util.List;

import rentalsystemofruby.db.IVideoDb;
import rentalsystemofruby.dto.Video;
import rentalsystemofruby.mapper.VideoMapper;

public class VideoDb extends AbstractDb<Video> implements IVideoDb  {

	@Override
	public Long save(Video video) {
        String sql = "INSERT INTO video (name, category, country, price, short_description, quantity, seri_number) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        return insert(sql, video.getName(), video.getCategory(), video.getCountry(),
        		video.getPrice(), video.getShortDescription(), video.getQuantity(), video.getSeriNumber());
		
	}

	@Override
	public Video findOne(Long seriNumber) {
        String sql = "SELECT * FROM video WHERE seri_number = ?";
        List<Video> video = querỵ̣(sql, new VideoMapper(), seriNumber);
        return video.isEmpty() ? null : video.get(0);
	}

}

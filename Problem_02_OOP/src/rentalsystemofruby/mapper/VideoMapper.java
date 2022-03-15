package rentalsystemofruby.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rentalsystemofruby.dto.Video;

public class VideoMapper implements IRowMapper<Video> {

	@Override
	public Video mapRow(ResultSet resultSet) {
		Video video = new Video();
        try {
        	video.setId(resultSet.getLong("id"));
        	video.setName(resultSet.getString("name"));
        	video.setCategory(resultSet.getString("category"));
        	video.setCountry(resultSet.getString("country"));
        	video.setPrice(resultSet.getFloat("price"));
        	video.setShortDescription(resultSet.getString("short_description"));
        	video.setQuantity(resultSet.getLong("quantity"));
        	video.setSeriNumber(resultSet.getLong("seri_number"));
        } catch (SQLException ex) {
            Logger.getLogger(Video.class.getName()).log(Level.SEVERE, null, ex);
        }
        return video;
	}

}

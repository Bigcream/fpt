package rentalsystemofruby.jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import rentalsystemofruby.db.IGenericDb;
import rentalsystemofruby.mapper.IRowMapper;

public class AbstractJdbc<T> implements IGenericJdbc<T> {
	
    private static final String DB_URL = "jdbc:mysql://localhost:3306/fpt_entry_test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "riengminhem123";

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("connect failure!");
        }
        return conn;
    }
    
	@Override
	public <T> List<T> querỵ̣(String sql, IRowMapper<T> rowMapper, Object... parameters) {
        List<T> results = new ArrayList<>();
        Connection connection = getConnection(DB_URL, USER_NAME, PASSWORD);
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            setParameter(statement, parameters);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                results.add(rowMapper.mapRow(resultSet));
            }
            return results;
        } catch (SQLException ex) {
            
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                
            }
        }
        return null;
	}

	@Override
	public void update(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long insert(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return null;
	}
    private void setParameter(PreparedStatement statement, Object... os) throws SQLException {
        for (int i = 0; i < os.length; i++) {
            int index = i + 1;
            Object ost = os[i];
            if (ost instanceof Long) {
                statement.setLong(index, (Long) ost);
            } else if (ost instanceof String) {
                statement.setString(index, (String) ost);
            } else if (ost instanceof Integer) {
                statement.setInt(index, (Integer) ost);
            } else if (ost instanceof Float) {
                statement.setFloat(index, (Float) ost);
            }
        }
    }

}

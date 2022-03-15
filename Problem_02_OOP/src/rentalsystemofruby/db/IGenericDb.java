package rentalsystemofruby.db;

import java.util.List;

import rentalsystemofruby.mapper.IRowMapper;

public interface IGenericDb<T> {
    <T> List<T> querỵ̣(String sql, IRowMapper<T> rowMapper, Object... parameters);
    void update(String sql, Object... parameters);
    Long insert(String sql, Object... parameters);
}

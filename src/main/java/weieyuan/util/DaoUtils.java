package weieyuan.util;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class DaoUtils {
	private SimpleJdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(String name, String sex, int degree)
	{
		String sql = "INSERT INTO weieyuan(name, sex, degree) values(?,?,?)";
		
		this.jdbcTemplate.update(sql, name, sex, degree);
	}
}

package webadv.s99201105.calculate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TrueRepository {	
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	

	public CalculateRepository FindTimu(int id) {
		String sql="select a as a,b as b, c as c,d as d from timu where id=?";		
		RowMapper<CalculateRepository> rowMapper=new BeanPropertyRowMapper<CalculateRepository>(CalculateRepository.class);
		List<CalculateRepository> list = jdbcTemplate.query(sql, rowMapper,id);	
		return list.get(0);
						
	}
}
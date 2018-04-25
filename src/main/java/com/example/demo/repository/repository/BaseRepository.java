package com.example.demo.repository.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.interfaces.IBaseRepository;

@Repository
@EnableAutoConfiguration
@Transactional
public class BaseRepository implements IBaseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	/**
	 * 
	 * @param pojo
	 * @param procedure
	 * @return
	 */
	public List<? extends Object> executeList(Class pojo, String procedure) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName(procedure).returningResultSet(DATA,
				new BeanPropertyRowMapper<>(pojo));
		return (List<Object>) call.execute(new HashMap<>(0)).get(DATA);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	/**
	 * 
	 * @param pojo
	 * @param procedure
	 * @param params
	 * @return
	 */
	public List<? extends Object> executeList(Class pojo, String procedure, HashMap<String, Object> params) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName(procedure).returningResultSet(DATA,
				new BeanPropertyRowMapper<>(pojo));
		return (List<Object>) call.execute(params).get(DATA);
	}

	/**
	 * 
	 * @param procedure
	 */
	public void execute(String procedure) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName(procedure);
		call.execute(new HashMap<>());
	}

	/**
	 * 
	 * @param procedure
	 * @param params
	 */
	public void execute(String procedure, HashMap<String, Object> params) {
		SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate).withProcedureName(procedure);
		call.execute(params);
	}

}

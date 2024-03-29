package com.pool.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import com.pool.models.User;

@Service
public class Services {
	@Autowired
	JdbcClient jdbcClient;
	
	public User saveUser(User user) {
		int updateCount = jdbcClient.sql("insert into user values(?,?,?)")
		.param(1, user.getId())
		.param(2, user.getName())
		.param(3,user.getStatus())
		.update();
		System.out.println("User updated "+updateCount);
	
		return user;
	}
	public List<User> getAllUsers(){
//		return jdbcClient.sql("select * from user").query(User.class).list();
		return jdbcClient.sql("select * from user").query(new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new User(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		}).list();
	}
	
	public User getUserById(int id) {
		return  jdbcClient.sql("select * from user where id = ?").param(1, id).query(User.class).single();
	}
	public void deleteUser(int id) {
		int deletedRowCount = jdbcClient.sql("delete from user where id=:id").param("id",id).update();
		System.out.println(deletedRowCount+" row deleted..");
	}

}

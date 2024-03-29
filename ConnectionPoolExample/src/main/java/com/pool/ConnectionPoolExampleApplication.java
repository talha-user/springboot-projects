package com.pool;





import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConnectionPoolExampleApplication implements CommandLineRunner {
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ConnectionPoolExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		
//		int rowCount = jdbcTemplate.update("delete from user where id=1");
//		System.out.println(rowCount+" rows deleted.");
//		int rowCount = jdbcTemplate.update("insert into user(id,name,status) values(1,'Talha','student')");
//		System.out.println(rowCount+" rows inserted.");
//		
//		List<Map<String,Object>> resultList = jdbcTemplate.queryForList("select * from user");
//		
//		resultList.forEach(item->{
////			System.out.println("[id:"+item.get("id")+" name:"+item.get("name")+" status:"+item.get("status")+"]");
//			System.out.println(item.toString());
		//});
		
	}

}

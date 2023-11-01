package in.suvam.todoauth;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TodoauthApplication {


	// private JdbcTemplate mysql;

	public static void main(String[] args) {
		SpringApplication.run(TodoauthApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
		
	// 	String query = "INSERT INTO tasks (task_name, task_time) VALUES (?, ?)";
	// 	int rslt = mysql.update(query, "Tailwind", "17:00");
	// 	if(rslt > 0)
	// 	{
	// 		System.out.println("1 row inserted");
	// 	}
	// }
}
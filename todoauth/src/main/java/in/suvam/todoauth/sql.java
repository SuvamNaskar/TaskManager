package in.suvam.todoauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class sql{
    private String query;
    private int result_count = 0;
    // private String result = "";

    @Autowired
    private JdbcTemplate mysql;

    void insertRow()
    {
        System.out.println("call success");
        query = "INSERT INTO tasks (task_name, task_time) VALUES (?, ?)";
        result_count = mysql.update(query, "Dinner", "21:00");
        if(result_count > 0)
        {
            System.out.println("1 row inseted");
        }
    }
}

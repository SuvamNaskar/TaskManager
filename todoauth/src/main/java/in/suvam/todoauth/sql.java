package in.suvam.todoauth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class sql{

    @Column(name = "task_name")
    private String name;

    @Column(name = "task_time")
    private String time;
}
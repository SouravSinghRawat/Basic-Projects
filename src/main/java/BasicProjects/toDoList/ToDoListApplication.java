package BasicProjects.toDoList;

import BasicProjects.toDoList.model.Task;
import BasicProjects.toDoList.repository.TaskRepo;
import BasicProjects.toDoList.service.TaskService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToDoListApplication {

    @Autowired
    private TaskRepo repo;
	public static void main(String[] args) {
        SpringApplication.run(ToDoListApplication.class, args);
	}

//    @Bean
//    CommandLineRunner run(TaskService service) {
//        return args -> {
//            service.addTask("Service Layer Test");
//            service.getAllTasks().forEach(task ->
//                    System.out.println(task.getTitle())
//            );
//        };
//    }
   
}

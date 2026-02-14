package BasicProjects.toDoList.repository;

import BasicProjects.toDoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task,Long> {
}

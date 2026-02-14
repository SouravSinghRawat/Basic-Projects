package BasicProjects.toDoList.service;

import BasicProjects.toDoList.model.Task;
import BasicProjects.toDoList.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepo repo;


    public TaskService(TaskRepo repo) {
        this.repo = repo;
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }

    public void addTask(String title){

        Task task=new Task(title, false);
        repo.save(task);
    }

    public void deleteTask(Long id){
        repo.deleteById(id);
    }

    public void markAsComplete(Long id){
       Task task = repo.findById(id).orElseThrow();
       task.setCompleted(true);
       repo.save(task);
    }


}

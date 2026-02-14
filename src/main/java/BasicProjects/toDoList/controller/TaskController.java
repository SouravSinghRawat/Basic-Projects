package BasicProjects.toDoList.controller;

import BasicProjects.toDoList.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    public final TaskService service;


    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("tasks", service.getAllTasks());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title) {
        service.addTask(title);
        System.out.println("POST ADD HIT");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/complete/{id}")
    public String completeTask(@PathVariable Long id) {
        service.markAsComplete(id);
        return "redirect:/";
    }

}

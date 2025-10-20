package com.edwinrhc.proyecto.task.controller;

import com.edwinrhc.proyecto.task.excepcions.TaskException;
import com.edwinrhc.proyecto.task.excepcions.TaskValidationExceptions;
import com.edwinrhc.proyecto.task.model.Task;
import com.edwinrhc.proyecto.task.model.TaskRepository;

import java.util.List;

public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addTask(String id, String title, String description, Boolean completed) throws TaskException {
        validateTaskData(id,title,description,completed);
        Task task = new Task(id,title,description,completed);
        this.taskRepository.save(task);
        System.out.println("La tarea fue agregada exitosamente");
    }

    public void removeTask(String id) throws TaskValidationExceptions, TaskException {
           if(id == null || id.trim().isEmpty()){
               throw new TaskValidationExceptions("El id no puede ser nulo o vacio");
           }
        this.taskRepository.remove(id);
        System.out.println("La tarea fue eliminada exitosamente");
    }

    public void showTaks() throws TaskValidationExceptions, TaskException {
      List<Task> tasks = this.taskRepository.findAll();
      if(tasks.isEmpty()){
          throw new TaskValidationExceptions("La lista no puede estar vacia");
      }
      for(Task task: tasks){
          System.out.println(task);
      }
    }

    public void updateTask(String id, String title, String description, Boolean completed) throws TaskException {
        validateTaskData(id,title,description,completed);
        Task updateTask = new Task(id,title,description,completed);
        this.taskRepository.update(updateTask);
        System.out.println("La tarea fue actualizada exitosamente");
    }


    private void validateTaskData(String id, String title, String description, Boolean completed) throws TaskException {
        if(id == null || id.trim().isEmpty()){
            throw new TaskException("El id no puede ser nulo o vacio");
        }
        if(title == null || title.trim().isEmpty()){
            throw new TaskException("El titulo no puede ser nulo o vacio");
        }
        if(description == null || description.trim().isEmpty()){
            throw new TaskException("La descripcion no puede ser nula o vacia");
        }
        if(completed == null){
            throw new TaskException("El estado no puede ser nulo");
        }
    }

}

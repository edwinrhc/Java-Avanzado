package com.edwinrhc.proyecto.task.view;

import com.edwinrhc.proyecto.task.controller.TaskController;
import com.edwinrhc.proyecto.task.excepcions.TaskException;
import com.edwinrhc.proyecto.task.excepcions.TaskValidationExceptions;
import com.edwinrhc.proyecto.task.model.Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskView {

    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n Gestión de Tareas");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Actualizar Tarea");
            System.out.println("4. Mostrar Tareas");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción");
            String options = scanner.nextLine();
            switch (options) {
                case "1":
                    addTaskView();
                    break;
                case "2":
                    removeTaskView();
                    break;
                case "3":
                    updateTaskView();
                    break;
                case "4":
                    showTaskView();
                    break;
                case "5":
                    System.out.println("Saliendo del sistema");
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo");

            }
        }
    }

    public void addTaskView() {
        try {

            Task task = getTaskInput();
            taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
            System.out.println("La tarea fue agregada exitosamente");
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado, Contacte con el soporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void removeTaskView() {
        try {
            System.out.println("Ingrese el ID de la tarea a eliminar");
            String id = scanner.nextLine();
            this.taskController.removeTask(id);
            System.out.println("Tarea eliminada exitosamente");
        } catch (TaskValidationExceptions | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado, Contacte con el soporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void showTaskView() {
        try {
            System.out.println("\nLa lista de Tareas");
            this.taskController.showTaks();

        } catch (TaskValidationExceptions | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado, Contacte con el soporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateTaskView() {
        try {

            Task task = getTaskInput();
            taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());
            System.out.println("La tarea fue actualizada exitosamente");
        } catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado, Contacte con el soporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    private Task getTaskInput() {


       String id = readRequiredString("ID de la tarea");
       String title = readRequiredString("titulo de la tarea");
       String description = readRequiredString("descripción de la tarea");
       Boolean completed = readBoolean("¿Esá completada? true/false");
        return new Task(id, title, description, completed);
    }

    private String readRequiredString(String message) {
        String input;
        do {
            System.out.println("Ingrese " + message + ":");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("El campo '" + message + "' no puede estar vacío");
            }

        } while (input.isEmpty());

        return input;
    }
    private Boolean readBoolean(String message){
        String input;
        do{
            System.out.println("Ingrese " + message + ":");
            input = scanner.nextLine().trim().toLowerCase();

            if(!input.equals("true") && !input.equals("false")){
                System.out.println("Ingrese solo 'true' o 'false'");
            }
        }while (!input.equals("true") && !input.equals("false"));
        return Boolean.parseBoolean(input);
    }

}

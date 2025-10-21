package com.edwinrhc.proyecto.task.view;

import com.edwinrhc.proyecto.task.controller.TaskController;
import com.edwinrhc.proyecto.task.excepcions.TaskException;
import com.edwinrhc.proyecto.task.excepcions.TaskValidationExceptions;

import java.util.Scanner;

public class TaskView {

    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController, Scanner scanner) {
        this.taskController = taskController;
        this.scanner = scanner;
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

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;

            }
        }
    }

    public void addTaskView() {
        try {
            System.out.println("Ingresar ID");
            String id = scanner.nextLine();

            System.out.println("Ingrese el Título");
            String title = scanner.nextLine();

            System.out.println("Ingrese la descripción");
            String description = scanner.nextLine();

            System.out.println("¿Esá completada? true/false");
            Boolean completed = Boolean.valueOf(scanner.nextLine());

            taskController.addTask(id, title, description, completed);
            System.out.println("La tarea fue agregada exitosamente");
        }catch (TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error inesperado, Contacte con el soporte" + e.getMessage());
            e.printStackTrace();
        }
    }
}

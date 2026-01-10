package com.edwinrhc.proyecto.task;

import com.edwinrhc.proyecto.task.controller.TaskController;
import com.edwinrhc.proyecto.task.model.TaskRepository;
import com.edwinrhc.proyecto.task.view.TaskView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();


    }
}
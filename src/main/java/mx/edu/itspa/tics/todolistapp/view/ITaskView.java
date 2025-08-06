/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.view;

import java.util.List;
import mx.edu.itspa.tics.todolistapp.model.Task;

/**
 *
 * @author kno_k
 */
public interface ITaskView {
    List<Task> showTasks();
    String getInput(String input);
    void showMessage(String msg);
}

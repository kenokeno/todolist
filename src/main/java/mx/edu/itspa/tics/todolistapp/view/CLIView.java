/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import mx.edu.itspa.tics.todolistapp.model.Task;

/**
 *
 * @author kno_k
 */
public class CLIView implements ITaskView{
    private BufferedReader leer 
            = new BufferedReader(new InputStreamReader(System.in));
    
    public void showMenu(){
        System.out
                .println("\n\n-----------------------< Aplicación To Do List > -----------------------\n");
        System.out
                .println("Selecciona una opción válida: ");
        System.out.println("1.- Crear tarea");
        System.out.println("2.- Mostrar tareas");
        System.out.println("3.- Completar tarea");
        System.out.println("4.- Eliminar tarea");
        System.out.println("5.- Salir\n");
        System.out.print("> ");
    }
    
    public void showAddTaskMenu(){
        System.out.println("\n--- TIPOS DE TAREA ---");
        System.out.println("1. Básica");
        System.out.println("2. Urgente (con fecha límite)");
    }
    
    @Override
    public void showTasks(List<Task> tasks) {
        for(Task task:tasks){
            System.out.println(task);
        }
    }

    @Override
    public String getInput(String input) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showMessage(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

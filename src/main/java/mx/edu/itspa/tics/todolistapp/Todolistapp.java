/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itspa.tics.todolistapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author kno_k
 */
public class Todolistapp {

    public static void main(String[] args) throws IOException {
        // objeto que me sirve para manipular la lista tareas de la bd del sistema
        ServicioTarea serviceTask 
                = new ServicioTarea();
        /* Sirve para controlar peticiones 
        del usuario del menu de opciones prinicipal*/
        int opcionSeleccionada=0;
        Tarea tarea;//variable que servira para crear tareas
        
        BufferedReader leer 
                = new BufferedReader
                    (new InputStreamReader
                        (System.in));
        do{
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
            opcionSeleccionada = Integer.parseInt(leer.readLine());
            switch(opcionSeleccionada){
                case 1:
                    System.out.println("\nIngresa la tarea: ");
                    System.out.print("> ");
                    serviceTask.crear(leer.readLine());
                    break;
                case 2:
                    serviceTask.mostrarTareas();
                    break;
                case 3:
                    serviceTask.listarTareas();
                    System.out
                            .println("\nIngresa el número de la tarea a marcar: ");
                    System.out.print("> ");
                    int indiceTarea 
                            = Integer.parseInt(leer.readLine());
                    Tarea _tarea = serviceTask.obtener(indiceTarea-1);
                    serviceTask.marcar(_tarea);
                    break;
                case 4:
                    serviceTask.listarTareas();
                    System.out
                            .println("\nIngresa el número de la tarea a marcar: ");
                    System.out.print("> ");
                    int _indiceTarea 
                            = Integer.parseInt(leer.readLine());
                    Tarea t = serviceTask.obtener(_indiceTarea-1);
                    serviceTask.eliminarTarea(t);
                    break;
                case 5:
                    System.out.println("Hasta luego!!!");
                    break;
                default:
                    System.out.println("Elige una opción válida");
                    break;
            }
        }while(opcionSeleccionada!=5);
    }
}

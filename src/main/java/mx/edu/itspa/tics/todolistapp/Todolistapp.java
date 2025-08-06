/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mx.edu.itspa.tics.todolistapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author kno_k
 */
public class Todolistapp {

    static BufferedReader leer
            = new BufferedReader(new InputStreamReader(System.in));
    // objeto que me sirve para manipular la lista tareas de la bd del sistema
    static ServicioTarea serviceTask = new ServicioTarea();

    public static void main(String[] args) {
        int opcionSeleccionada=0;
        try {
            do {
                mostrarMenu();
                opcionSeleccionada = manejarOpcionSeleccionada();
            } while (opcionSeleccionada != 5);
        } catch (IOException e) {
            System.out.println("Entrada no válida");
        } finally {
            try {
                leer.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el recurso.");
            }
        }

    }

    public static void mostrarMenu() {
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

    public static int manejarOpcionSeleccionada() throws IOException {        
        /* Sirve para controlar peticiones 
        del usuario del menu de opciones prinicipal*/
        int opcionSeleccionada = 0;
        Tarea tarea;//variable que servira para crear tareas
        opcionSeleccionada = Integer.parseInt(leer.readLine());

        switch (opcionSeleccionada) {
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
                tarea = serviceTask.obtener(indiceTarea - 1);
                serviceTask.marcar(tarea);
                break;
            case 4:
                serviceTask.listarTareas();
                System.out
                        .println("\nIngresa el número de la tarea a marcar: ");
                System.out.print("> ");
                int _indiceTarea
                        = Integer.parseInt(leer.readLine());
                tarea = serviceTask.obtener(_indiceTarea - 1);
                serviceTask.eliminarTarea(tarea);
                break;
            case 5:
                System.out.println("Hasta luego!!!");
                break;
            default:
                System.out.println("Elige una opción válida");
                break;
        }
        return opcionSeleccionada;
    }
}

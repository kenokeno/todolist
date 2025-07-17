/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.TestApp;

import static junit.framework.Assert.assertEquals;
import mx.edu.itspa.tics.todolistapp.ServicioTarea;
import mx.edu.itspa.tics.todolistapp.Tarea;
import org.junit.Test;

/**
 *
 * @author kno_k
 */
public class TestToDoListApp {
    @Test
    public void testCrear(){
        ServicioTarea serviceTask = new ServicioTarea();
        serviceTask
                .crear(new Tarea("Correr por la manana"));        
        serviceTask
                .crear(new Tarea("Llamar por telefono"));
        assertEquals(2, serviceTask.obtenerTareas().size());
    }
}

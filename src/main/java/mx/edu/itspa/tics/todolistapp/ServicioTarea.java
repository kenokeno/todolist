/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kno_k
 */
public class ServicioTarea {
    private List<Tarea> listaTareas = new ArrayList<Tarea>();
    
    /**
    * Método que añade tareas al sistema
    * @param tarea Tarea a ser añadida
    * @return tarea Tarea añadida
    */
    public Tarea crear(Tarea tarea){
        listaTareas.add(tarea);
        return tarea;
    }
    
    public Tarea crear(String descripcion){
        Tarea tarea = new Tarea(descripcion);
        listaTareas.add(tarea);
        return tarea;
    }
    
    public void marcar(Tarea tarea){
        for(Tarea _tarea : listaTareas){
            if(_tarea.getDescripcion()
                    .equalsIgnoreCase(
                            tarea.getDescripcion())){
                _tarea.setEstado("completada");
            }
        }
    }
    
    /**
    * Método que muestra las tareas existentes en el sistema
    */
    public void mostrarTareas(){
        for(Tarea tarea : listaTareas){
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Fecha: " + tarea.getFecha());
            System.out.println("Estado: " + tarea.getEstado());
        }
    }
    
    public boolean eliminarTarea(Tarea tarea){
        List<Tarea> _listaTareas 
                = new ArrayList();
        for(Tarea _tarea : listaTareas){
            if(!_tarea.getDescripcion()
                    .equalsIgnoreCase(
                            tarea.getDescripcion())){
                _listaTareas.add(_tarea);
            }
        }
        listaTareas = _listaTareas;
        return true;
    }
    
    public void listarTareas(){
        for(int i=1;i<=listaTareas.size();i++){
            System.out
                    .println(i 
                            + ".- " 
                            + listaTareas.get(i-1)
                                    .getDescripcion());
        }
    }
    
    public Tarea obtener(int i){
        return listaTareas.get(i);
    }
    
    // Métodos a implementar:
    public void marcarCompleada(int indice){
        listaTareas.get(indice).setEstado("completada");
    }
    
    public List<Tarea> obtenerTareas(){
        return listaTareas;
    }
    
    public boolean esTareaCompletada(String descripcion){
        for(Tarea _tarea : listaTareas){
            if(_tarea.getDescripcion()
                    .equalsIgnoreCase(
                            descripcion)){
                return _tarea.getEstado().equalsIgnoreCase("completada");
            }
        }
        return false;
    }
    
    public void eliminarTarea(int indice){
        List<Tarea> _listaTareas = new ArrayList();
        for(int i=0;i<listaTareas.size();i++){
            if(indice!=i){
                _listaTareas.add(listaTareas.get(i));
            }
        }
        listaTareas = _listaTareas;
    }
    // public void marcarCompletada(int indice) //try catch finally
    // public void eliminarTarea(int indice) //try catch finally
    // public List<Tarea> obtenerTareas()
    // public boolean esTareaCompletada(String descripcion)
}

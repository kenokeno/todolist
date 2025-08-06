/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kno_k
 */
public class TaskRepository implements IRepositoryTask{

    private List<Task> tasks;
    
    public TaskRepository(){
        tasks=new ArrayList();
    }
    
    public List<Task> getTaskByType(String type){
        List<Task> listaAuxiliar = new ArrayList();
        
        for(Task task : tasks){
            switch(type.toLowerCase()){
                case "basic":
                    if(task instanceof BasicTask){
                        listaAuxiliar.add(task);
                    }
                    break;
                case "urgent":
                    if(task instanceof UrgentTask){
                        listaAuxiliar.add(task);
                    }
                    break;
                default: return tasks;
            }
        }        
        
        return listaAuxiliar;
    }
    
    @Override
    public List<Task> getAll() {
        return tasks;
    }

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public boolean update(int id, String description) {
        for(Task task : tasks){
            if(task.id==id){
                task.description=description;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        List<Task> listaAuxiliar = new ArrayList();

        for(Task task : tasks){
            if(task.id!=id){
                listaAuxiliar.add(task);
            }
        }
        
        if (tasks.size() == listaAuxiliar.size()){
            return false;
        }else{
            tasks = listaAuxiliar;
            return true;
        }
    }
    
}

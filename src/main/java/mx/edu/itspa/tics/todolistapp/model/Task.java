/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.model;

/**
 *
 * @author kno_k
 */
public abstract class Task {
    int id;
    String description;
    boolean completed;
    
    public Task(int id, String description, boolean completed){
        this.id=id;
        this.description=description;
        this.completed=completed;
    }
    
    public abstract String getPriority();
    public void completeTask(){
        this.completed=true;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        return str.append("\nId: ")
                .append(id)
                .append("\nDescription: ")
                .append(description)
                .append("\nCompleted: ")
                .append(completed)
                .append("\nType: ")
                .append(getPriority()).toString();        
    }
}

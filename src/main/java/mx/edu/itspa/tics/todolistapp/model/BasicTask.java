/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.model;

/**
 *
 * @author kno_k
 */
public class BasicTask extends Task{
    
    public BasicTask(int id, String description){
        super(id,description, false);
    }

    @Override
    public String getPriority() {
        return "Basic Task";
    }
    
}

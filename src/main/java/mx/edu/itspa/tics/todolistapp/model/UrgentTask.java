/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.model;

/**
 *
 * @author kno_k
 */
public class UrgentTask extends Task{
    private String deadLine;

    public UrgentTask(int id, String description,String deadLine) {
        super(id, description, false);
        this.deadLine=deadLine;
    }

    @Override
    public String getPriority() {
        return "Urgent Task (deadline: "+ deadLine +")";
    }
    
}

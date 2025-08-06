/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.edu.itspa.tics.todolistapp.model;

import java.util.List;

/**
 *
 * @author kno_k
 */
public interface IRepositoryTask {
    public List<Task> getAll();
    public void add(Task task);
    public boolean update(int id,String description);
    public boolean delete(int id);
}

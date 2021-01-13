package Interface;

import java.util.ArrayList;

public interface Irepository <T> {


    public boolean create(T entity);                    //Insert
    public boolean update(int index, T entity);         //Update
    public ArrayList<T> read();                         //Display
    public boolean delete(int index);                   //Delete
   // public T find(String value);

}

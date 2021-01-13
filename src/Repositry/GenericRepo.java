package Repositry;

import Interface.Irepository;

import java.util.ArrayList;
import java.util.List;

public class GenericRepo <T> implements Irepository <T> {

   ArrayList<T> repo;
    public  GenericRepo()
    {
        repo = new ArrayList<T>();
    }

    @Override
    public boolean create(T entity) {
            repo.add(entity);
        return true;
    }

        @Override
    public boolean update(int index, T entity) {
        repo.set(index, entity);
        return true;

    }

    @Override
    public ArrayList <T> read() {

      return repo;

    }

    @Override
    public boolean delete(int index) {
      repo.remove(index);
        return true;
    }

   // @Override
   // public T find(String value) {

      //  return null;
    }

package homework.persister.impl;

import homework.User;
import homework.persister.Persisterable;

public class Persister implements Persisterable{
   
    @Override
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}

package com.edwinrhc.datastore;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datastore<User, String> userStore = new Datastore<>();

        try{
            System.out.println("Añadiendo usuarios");
            userStore.add("123",new User("123","Ana"));
            userStore.add("1234",new User("1234","Maria"));
            userStore.add("12345",new User("12345","Edwin"));
//            userStore.add(null,new User("12345","Edwin"));
            User encontrado = userStore.find("123");
            System.out.println("Usuario encontrado:" + encontrado);
            User eliminado = userStore.remove("12345");
            System.out.println("Usuario eliminado:" + eliminado);

        }catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
        List<User> users = userStore.getAll();
        for(User user: users){
            System.out.println(user);
        }

    }
}

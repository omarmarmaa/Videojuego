package edu.iesam.data;

import edu.iesam.domain.Videojuegos;

import java.util.ArrayList;
import java.util.Objects;

public class VideojuegosMemLocalDataSource {
     private  static  VideojuegosMemLocalDataSource instance;

     public ArrayList<Videojuegos> storage= new ArrayList<>();

     public ArrayList<Videojuegos> findAll(){
         return  storage;
     }

     public void  add(Videojuegos videojuegos){
         storage.add(videojuegos);
     }

     public  void delete(String videojuegoId){
         storage.removeIf(videojuegos -> Objects.equals(videojuegos.getId(),videojuegoId));
     }

     public static VideojuegosMemLocalDataSource newInstance(){
         if (instance== null){
             instance= new VideojuegosMemLocalDataSource();
         }
         return  instance;
     }
}

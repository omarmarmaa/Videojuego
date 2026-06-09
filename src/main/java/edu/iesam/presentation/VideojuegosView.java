package edu.iesam.presentation;

import edu.iesam.data.VideojuegosDataRepository;
import edu.iesam.data.VideojuegosMemLocalDataSource;
import edu.iesam.domain.AddVideojuegoUseCase;
import edu.iesam.domain.DeleteVideojuegoUseCase;
import edu.iesam.domain.GetVideojuegoUseCase;
import edu.iesam.domain.Videojuegos;

import java.util.ArrayList;

public class VideojuegosView {
    public static void AddVideojuego(){
        AddVideojuegoUseCase addVideojuegoUseCase=new AddVideojuegoUseCase(new VideojuegosDataRepository(VideojuegosMemLocalDataSource.newInstance()));
        Videojuegos videojuegos=new Videojuegos("omar","dole","1");
    }

    public  static  void DeleteVideojuego() {
        DeleteVideojuegoUseCase deleteVideojuego = new DeleteVideojuegoUseCase(new VideojuegosDataRepository(VideojuegosMemLocalDataSource.newInstance()));
        deleteVideojuego.DeleteVideojuegoUseCase("1");
    }

    public static  void Getusecase(){
        GetVideojuegoUseCase getVideojuegoUseCase=new GetVideojuegoUseCase(new VideojuegosDataRepository(VideojuegosMemLocalDataSource.newInstance()));
        ArrayList<Videojuegos> Videojuegos= getVideojuegoUseCase.getALL();
    }

    public static void  function1(){
        Getusecase();
        Videojuegos videojuegos=new Videojuegos("omar","dole","1");
        Getusecase();
    }
    public  static  void function2(){
        AddVideojuego();
    }

    public  static  void function3(){
        DeleteVideojuego();
    }
}

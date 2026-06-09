package edu.iesam.presentation;

import edu.iesam.data.VideojuegosDataRepository;
import edu.iesam.data.VideojuegosMemLocalDataSource;
import edu.iesam.domain.GetVideojuegoUseCase;
import edu.iesam.domain.Videojuegos;

import java.util.ArrayList;

public class VideojuegosView {
    public static  void Getusecase(){
        GetVideojuegoUseCase getVideojuegoUseCase=new GetVideojuegoUseCase(new VideojuegosDataRepository(VideojuegosMemLocalDataSource.newInstance()));
        ArrayList<Videojuegos> Videojuegos= getVideojuegoUseCase.getALL();
    }

    public static void  function1(){
        Getusecase();
        Videojuegos videojuegos=new Videojuegos("omar","dole","1");
        Getusecase();
    }
}

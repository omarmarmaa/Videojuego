package edu.iesam.domain;

import java.util.ArrayList;

public class GetVideojuegoUseCase {
    VideojuegoRepository videojuegoRepository;
    public GetVideojuegoUseCase(VideojuegoRepository videojuegoRepository){
        this.videojuegoRepository=videojuegoRepository;
    }

    public ArrayList<Videojuegos> getALL(){
        return videojuegoRepository.GetAll();
    }
}

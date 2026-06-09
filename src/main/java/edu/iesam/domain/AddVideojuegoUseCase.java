package edu.iesam.domain;

public class AddVideojuegoUseCase {
    VideojuegoRepository videojuegoRepository;
   public AddVideojuegoUseCase(VideojuegoRepository videojuegoRepository){
       this.videojuegoRepository=videojuegoRepository;
   }

   public void Add(Videojuegos videojuegos){
       videojuegoRepository.add(videojuegos);
   }
}

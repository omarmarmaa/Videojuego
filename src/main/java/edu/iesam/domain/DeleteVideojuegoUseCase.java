package edu.iesam.domain;

public class DeleteVideojuegoUseCase {
    VideojuegoRepository videojuegoRepository;

    public DeleteVideojuegoUseCase(VideojuegoRepository videojuegoRepository){
        this.videojuegoRepository= videojuegoRepository;
    }

    public void DeleteVideojuegoUseCase(String id){
        this.videojuegoRepository.delete(id);
    }
}

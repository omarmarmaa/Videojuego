package edu.iesam.data;

import edu.iesam.domain.VideojuegoRepository;
import edu.iesam.domain.Videojuegos;

import java.util.ArrayList;

public class VideojuegosDataRepository implements VideojuegoRepository {
    VideojuegosMemLocalDataSource videojuegosMemLocalDataSource;

    public VideojuegosDataRepository(VideojuegosMemLocalDataSource videojuegosMemLocalDataSource){
        this.videojuegosMemLocalDataSource=videojuegosMemLocalDataSource;
    }

    @Override
    public void add(Videojuegos videojuegos) {
        this.videojuegosMemLocalDataSource.add(videojuegos);
    }

    @Override
    public void delete(String id) {
        this.videojuegosMemLocalDataSource.delete(id);

    }

    @Override
    public ArrayList<Videojuegos> GetAll() {
        return videojuegosMemLocalDataSource.findAll();
    }

    @Override
    public Videojuegos getid(String id) {
        return videojuegosMemLocalDataSource.findAll().get(0);
    }
}

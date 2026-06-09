package edu.iesam.domain;

import java.util.ArrayList;

public interface VideojuegoRepository {
    void add(Videojuegos videojuegos);
    void delete(String id);
    ArrayList<Videojuegos>GetAll();
    Videojuegos getid(String id);
}

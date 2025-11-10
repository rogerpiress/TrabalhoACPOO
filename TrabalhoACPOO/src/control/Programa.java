package control;

import model.Evento;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(Evento e) {
        eventos.add(e);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }
}

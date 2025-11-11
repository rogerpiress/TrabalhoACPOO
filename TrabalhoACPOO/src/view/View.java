package view;

import model.Evento;
import java.util.List;

public class View {
    public void mostrarEventos(List<Evento> eventos) {
        System.out.println("\n--- Lista de Eventos ---");
        for (Evento e : eventos) {
            e.exibirDetalhes();
        }
    }
}

package control;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class Programa {
    private List<Evento> eventos = new ArrayList<>();

    // Criação automática de exemplos
    public Programa() {
        criarExemplos();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void exibirEventos() {
        System.out.println("Eventos:");
        for (Evento e : eventos) {
            e.exibirDetalhes();
        }
    }

    private void criarExemplos() {
        // Locais
        Auditorio auditorio = new Auditorio("Auditório Central", 150, true);
        Sala sala = new Sala("Sala 420", 40, true);
        Laboratorio lab = new Laboratorio("Laboratório de POO", 30, 25);

        // Pessoas
        Instrutor instrutor = new Instrutor("João", "joao@gmail.com", "Arquitetura de Bobbie Goods");
        Organizador organizador = new Organizador("Maria", "maria@gmail.com", "Coordenação");

        // Participantes
        Participante p1 = new Participante("Lucas", "123456789");
        Participante p2 = new Participante("Letícia", "987654321");
        Participante p3 = new Participante("Bruno", "111222333");

        // --- 3 Palestras ---
        adicionarEvento(new Palestra("Impacto Bobbie Goodiano Mundial", "10/11/2025", 2, 500.0, auditorio, instrutor, "Lucas"));
        adicionarEvento(new Palestra("Pistache e o relacionamento da Virgínia e do VInícius Junior", "10/11/2025", 2, 600.0, sala, organizador, "Letícia"));
        adicionarEvento(new Palestra("Norton VPN e as bets de esporte", "10/11/2025", 3, 700.0, auditorio, instrutor, "Bruno"));

        // --- 3 Minicursos ---
        Minicurso m1 = new Minicurso("Como pintar perfeitamente o Bobbie Goods", "10/11/2025", 4, 300.0, lab, instrutor);
        m1.adicionarMaterial("Bobbie Goods e Canetinhas");
        Minicurso m2 = new Minicurso("Curso de desenho de CapiJavas", "10/11/2025", 3, 350.0, lab, organizador);
        m2.adicionarMaterial("Laptop com acesso ao IntelliJ");
        Minicurso m3 = new Minicurso("Curso de maternidade de bebê reborn", "10/11/2025", 4, 400.0, lab, instrutor);
        m3.adicionarMaterial("Seu filho reborn");
        adicionarEvento(m1);
        adicionarEvento(m2);
        adicionarEvento(m3);

        // --- 3 Seminários ---
        adicionarEvento(new Seminario("Tecnologia IA", "10/11/2025", 3, 600.0, auditorio, organizador, "ChatGPT"));
        adicionarEvento(new Seminario("Sustentabilidade", "10/11/2025", 2, 450.0, sala, instrutor, "Energia Limpa"));
        adicionarEvento(new Seminario("Política", "10/11/2025", 2, 500.0, auditorio, organizador, "Eleições de 2026 (Polêmico)"));
    }

    public static void main(String[] args) {
        Programa controller = new Programa();
        controller.exibirEventos();
    }
}

package partidosliga;

import java.util.ArrayList;
import java.util.List;
import partidosliga.Partido;

public class GestorDePartidos {
    private List<Partido> partidos;

    public GestorDePartidos() {
        this.partidos = new ArrayList<>();
    }

    public void registrarPartido(Partido partido) {
        partidos.add(partido);
        System.out.println("Partido registrado exitosamente.");
    }

    public void finalizarPartido(int indice) {
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            partido.finalizarPartido();
            if (partido.haFinalizado()) {
                System.out.println("Partido finalizado. Ganador: " + partido.obtenerGanador());
            }
        } else {
            System.out.println("Índice de partido inválido.");
        }
    }

    public void mostrarGanador(int indice) {
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            if (partido.haFinalizado()) {
                System.out.println("Ganador: " + partido.obtenerGanador());
            } else {
                System.out.println("El partido aún no ha finalizado.");
            }
        } else {
            System.out.println("Índice de partido inválido.");
        }
    }

    public void mostrarInformacion(int indice) {
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            System.out.println(partido.obtenerInformacion());
            System.out.println("Resultado: " + partido.obtenerResultado());
            if (partido.haFinalizado()) {
                System.out.println("Ganador: " + partido.obtenerGanador());
            } else {
                System.out.println("Partido en juego.");
            }
        } else {
            System.out.println("Índice de partido inválido.");
        }
    }

    public void listarPartidos() {
        if (partidos.isEmpty()) {
            System.out.println("No hay partidos registrados.");
        } else {
            for (int i = 0; i < partidos.size(); i++) {
                System.out.println((i + 1) + ". " + partidos.get(i).obtenerInformacion());
            }
        }
    }
}
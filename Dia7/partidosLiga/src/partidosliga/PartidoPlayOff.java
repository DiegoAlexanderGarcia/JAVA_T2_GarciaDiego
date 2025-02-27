package partidosliga;

import java.time.LocalDate;

public class PartidoPlayOff extends Partido {
    private String ronda;

    public PartidoPlayOff(String EquipoLocal, String EquipoVisitante, LocalDate FechaPartido, String ronda) {
        super(EquipoLocal, EquipoVisitante, FechaPartido);
        this.ronda = ronda;
    }

    @Override
    public void finalizarPartido() {
        if (CestasLocal != CestasVisitante) {
            this.EstadoPartido = true;
        } else {
            System.out.println("No se puede finalizar el partido porque está empatado.");
        }
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + " | Ronda: " + ronda;
    }
}
    

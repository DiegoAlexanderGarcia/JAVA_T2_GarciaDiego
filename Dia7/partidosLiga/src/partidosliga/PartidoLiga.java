package partidosliga;

import java.time.LocalDate;

public class PartidoLiga extends Partido{
    private int numeroJornada;

    public PartidoLiga(String EquipoLocal, String EquipoVisitante, LocalDate FechaPartido, int numeroJornada) {
        super(EquipoLocal, EquipoVisitante, FechaPartido);
        this.numeroJornada = numeroJornada;
    }
    
    @Override
    public void finalizarPartido() {
        this.EstadoPartido = true;
    }
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion() + " | Jornada: " + numeroJornada;
    }            
}

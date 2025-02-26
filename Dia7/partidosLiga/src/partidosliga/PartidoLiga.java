package partidosliga;

import java.time.LocalDate;

public class PartidoLiga extends Partido{
    private int numeroJornada;

    public PartidoLiga(int nomeroJornada, String EquipoLocal, String EquipoVisitante, int CestasLocal, int CestasVisitante, boolean EstadoPartido, LocalDate FechaPartido) {
        super(EquipoLocal, EquipoVisitante, CestasLocal, CestasVisitante, EstadoPartido, FechaPartido);
        this.numeroJornada = numeroJornada;
    }
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion() + " | Jornada: " + numeroJornada;
    }            
}

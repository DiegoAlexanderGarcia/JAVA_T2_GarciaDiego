package partidosliga;

import java.time.LocalDate;

public class PartidoPlayOff extends Partido {
    private String ronda;

    public PartidoPlayOff(String ronda, String EquipoLocal, String EquipoVisitante, int CestasLocal, int CestasVisitante, boolean EstadoPartido, LocalDate FechaPartido) {
        super(EquipoLocal, EquipoVisitante, CestasLocal, CestasVisitante, EstadoPartido, FechaPartido);
        this.ronda = ronda;
    }
    
    @Override
    public void finalizarPartido(){
        if(CestasLocal != CestasVisitante){
            super.finalizarPartido();
        }else{
            System.out.println("No se puede finalizar el partido porque está empatado.");
        }
    }
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion()+ " | Ronda: " + ronda;
    }
}
    

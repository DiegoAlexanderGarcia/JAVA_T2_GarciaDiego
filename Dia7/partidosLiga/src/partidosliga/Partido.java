package partidosliga;

import java.time.LocalDate;

public class Partido {
    protected String EquipoLocal;
    protected String EquipoVisitante;
    protected int CestasLocal;
    protected int CestasVisitante;
    protected boolean EstadoPartido;
    protected LocalDate FechaPartido;

    public Partido(String EquipoLocal, String EquipoVisitante, int CestasLocal, int CestasVisitante, boolean EstadoPartido, LocalDate FechaPartido) {
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.CestasLocal = 0;
        this.CestasVisitante = 0;
        this.EstadoPartido = false;
        this.FechaPartido = FechaPartido;
    }
    
    public void RegistrarCestas(String equipo, int puntos){
        if (!EstadoPartido){
            if (equipo.equalsIgnoreCase(EquipoLocal)){
                CestasLocal += puntos;
            }else if (equipo.equalsIgnoreCase(EquipoVisitante)){
                CestasVisitante += puntos;
            }
        }
    }
    
    public String obtenerResultado(){
        return EquipoLocal + ": " + CestasLocal + " - " + EquipoVisitante + ": " + CestasVisitante;
    }
    
    public String obtenerGanador(){
        if (CestasLocal > CestasVisitante){
            return EquipoLocal;
        }else if( CestasVisitante > CestasLocal){
            return EquipoVisitante;
        }else {
            return "Empate";
        }
    }
    
    public void finalizarPartido(){
        this.EstadoPartido = true;
    }
    
    public boolean haFinalizado(){
        return EstadoPartido;
    }
    
    public String obtenerInformacion(){
        return "Partido: " + EquipoLocal + " vs " + EquipoVisitante + " | fecha: " + FechaPartido;
    }
    
}

package examenPoo2;

public class salaTradicional extends reserva{

    private int duracionMin;

    public salaTradicional(String codigo, String nombrePelicula, Double costoBase, int duracionMin){
        super(codigo, nombrePelicula, costoBase);
        this.duracionMin = duracionMin;
    }

    
    @Override
    public String obtenerDetalles() {
        String tenerDetalles = super.obtenerDetalles();
        return tenerDetalles + " Duracion: " + duracionMin + "min";
    }
    
}

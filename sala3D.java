package examenPoo2;

public class sala3D extends reserva {

    private Double valorLentes;


    public sala3D (String codigo, String nombrePelicula, Double costoBase, Double valorLentes){
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

     @Override
    public String obtenerDetalles() {
        String tenerDetalles = super.obtenerDetalles();
        return tenerDetalles + " Valor: " + valorLentes;
    }

    
}

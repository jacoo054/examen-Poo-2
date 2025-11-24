package examenPoo2;

public class reserva {
    private String codigo;
    private String nombrePelicula;
    private Double costoBase;
    

    public reserva(String codigo, String nombrePelicula, Double costoBase){
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }


    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getNombrePelicula() {
        return nombrePelicula;
    }


    public Double getCostoBase() {
        return costoBase;
    }

     public String obtenerDetalles(){
        return codigo + nombrePelicula + costoBase;
     }

     
}

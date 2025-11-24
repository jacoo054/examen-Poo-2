package examenPoo2;

public class reservaR {
    
    public static void main(String [] args){

        gestorReservas reservas = new gestorReservas(4);

        reserva salaTradicional1 = new salaTradicional("1", "Avatar" , 15.000, 120);
        reserva salaTradicional2 = new salaTradicional("2", "Guerra Mundial Z", 20.000, 150);
        reserva sala3D1 = new sala3D("11", "El Conjuro", 19.000, 2.000);
        reserva sala3D2 = new sala3D("22", "Los minions", 18.000, 3.000);
        

        reservas.agregarReserva(salaTradicional1);
        reservas.agregarReserva(salaTradicional2);
        reservas.agregarReserva(sala3D1);
        reservas.agregarReserva(sala3D2);

        double total = 0;

        for(int i = 0; i < reservas.getReserva().length; i++){
            System.out.println(reservas.getReserva()[i].obtenerDetalles());
            total += reservas.getReserva()[i].getCostoBase();
        }
        System.out.println("Total:" + total);
    
    }
}

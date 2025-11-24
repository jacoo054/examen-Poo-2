package examenPoo2;

import practica.ItemMenu;

public class gestorReservas {
    
    private reserva[] reservas;
    private int contador;


    public gestorReservas(int capacidad){
        reservas = new reserva[capacidad];
        contador = 0;
    }
    public void agregarReserva(reserva reserva){

        reservas [contador] = reserva;
        contador += 1;
    }
    public reserva[] getreserva() {
        return reservas;
    }

}

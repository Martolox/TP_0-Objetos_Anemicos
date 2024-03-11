package unrn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    static final DateTimeFormatter fCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static final DateTimeFormatter fLargo = DateTimeFormatter.ofPattern("EEEE',' d 'de' MMMM 'de' yyyy");

    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        TiempoRecord tiempoRec = new TiempoRecord(LocalDate.now());

        System.out.println("Objeto no anémico");
        System.out.println(tiempo.FormatoCorto());
        System.out.println(tiempo.FormatoLargo());
        System.out.println("Objeto anémico");
        System.out.println(tiempo.getFecha().format(fCorto));
        System.out.println(tiempo.getFecha().format(fLargo));
        System.out.println("Record");
        System.out.println(tiempoRec.fecha().format(fCorto));
        System.out.println(tiempoRec.fecha().format(fLargo));
    }
}
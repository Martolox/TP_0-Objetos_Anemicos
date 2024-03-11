package unrn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tiempo {
    private LocalDate fecha = LocalDate.now();
    private DateTimeFormatter fCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter fLargo = DateTimeFormatter.ofPattern("EEEE',' d 'de' MMMM 'de' yyyy");

    public LocalDate getFecha() {  return fecha;  }
    public String FormatoCorto () {
        return fecha.format(fCorto);
    }
    public String FormatoLargo() {
        return fecha.format(fLargo);
    }
}

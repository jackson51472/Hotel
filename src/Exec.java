import java.util.Calendar;
import java.util.Date;

public class Exec {
    public static void main(String[] args) {

        QuartoHotel q1 =new QuartoHotel(2,2,201,2,"Hotel Plaza","223155332");
        Cliente c1 = new Cliente(4,2,"84556278","Jackson");
        Reserva r1 =new Reserva(Calendar.getInstance(),Calendar.getInstance(), q1, c1);

        System.out.println(r1.verificarCheckin(r1.getDataEntrada()));
        System.out.println(r1.verificarCheckout(r1.getDataSaida()));



    }
}

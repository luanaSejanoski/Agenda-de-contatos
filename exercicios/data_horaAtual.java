import java.time.*;
import java.time.format.*;
import  java.util.*;

public class data_horaAtual {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    ZoneId sp = ZoneId.of("America/Sao_Paulo");
    ZoneId lon = ZoneId.of("Europe/London");
    ZoneId toq= ZoneId.of("Asia/Tokyo");
    ZoneId ny= ZoneId.of("America/New_York");


    ZonedDateTime agora1 = ZonedDateTime.now(sp);
    ZonedDateTime agora2 = ZonedDateTime.now(lon);
    ZonedDateTime agora3= ZonedDateTime.now(toq);
    ZonedDateTime agora4 = ZonedDateTime.now(ny);


    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("SãoPaulo: " + agora1.format(formato));
    System.out.println("Londres: " + agora2.format(formato));
    System.out.println("Tóquio: " + agora3.format(formato));
    System.out.println("Nova York: " + agora4.format(formato));



    }
    
}

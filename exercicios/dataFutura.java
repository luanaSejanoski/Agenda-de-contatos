import java.time.*;
import java.time.format.*;
import  java.time.temporal.ChronoUnit;
import java.util.*;

public class dataFutura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();

        System.out.println("Informe uma data futura: ");
        String dataDigitada = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataFutura = LocalDate.parse(dataDigitada, formato);

        ZoneId brasilia = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime agora = ZonedDateTime.now(brasilia);

        long diasRestantes = ChronoUnit.DAYS.between(hoje, dataFutura);

        System.out.print("Faltam " + diasRestantes + " dias para as férias");
   
        scanner.close();
    }
}


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data prevista para o pagamento:");
        String dataP = scanner.next();

        System.out.print("Data efetiva para o pagamento:");
        String dataE = scanner.next();

        System.out.print("Valor da dívida:");
        double valor = scanner.nextDouble();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataPrevista = LocalDate.parse(dataP, formato);
        LocalDate dataEfetiva = LocalDate.parse(dataE, formato);

        long diferenca = ChronoUnit.DAYS.between(dataPrevista, dataEfetiva);

        System.out.println("Data prevista: " + dataPrevista.format(formato));
        System.out.println("Data Pagamento: " + dataEfetiva.format(formato));

        if(diferenca < 0){
            double juros = valor * 0.2;
            valor += juros;
            System.out.println("Pagamento em atraso");
            System.out.println("Dias de atraso: " + diferenca);
            System.out.println("Juros: R$" + juros);
            System.out.println("Valor final: " + valor);
        }
        else{
            System.out.println("Pagamento realizado no prazo.");
            System.out.println("Valor: " + valor);
        }
        scanner.close();
    }
}

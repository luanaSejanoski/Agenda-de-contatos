import java.time.LocalDate;
import java.time.format.*;
import java.util.*;

public class adicionaData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data: ");
        String data = scanner.next();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataOriginal = LocalDate.parse(data, formato);

        LocalDate sete = dataOriginal.plusDays(7);
        LocalDate trinta = dataOriginal.plusDays(30);
        LocalDate um = dataOriginal.plusYears(1);

        System.out.println("Data Original: " + dataOriginal);
        System.out.println("+7 dias: " + sete.format(formato));
        System.out.println("+30 dias: " + trinta.format(formato));
        System.out.println("+1 ano " + um.format(formato));


        scanner.close();
    }
}

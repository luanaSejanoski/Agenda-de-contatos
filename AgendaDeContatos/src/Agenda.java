import java.util.ArrayList;
import java.util.Scanner;
 
class Agenda {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
 
        int opcao;
 
        while (true) {
 
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); /* Limpar buffer */
            
            if (opcao == 5) {
                break;
            }
 
            switch (opcao) {
 
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                     while(true) {
                        menuEditar();
                        opcao = scanner.nextInt();
                        
                        if(opcao == 3){
                             break;
                        }
                                
                        switch (opcao) {
 
                            case 1:
                                EditarTelefone((scanner), lista);
                                break;
                            case 2:
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    }
 
                   break;
 
                case 3:
                    excluirContato(scanner, lista);
                    break;
                case 4:
                    listarContatos(lista);
                    break;
 
                 default:
                    System.out.println("Opcao invalida!");
            }
 
            System.out.println();
        }
 
        scanner.close();
    }
    
    public static void menuPrincipal(){
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
 
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }

    
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
    
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
 
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();
 
        lista.add(new Contato(nome, telefone, email));
 
        System.out.println("Contato adicionado!");
    }
    
    public static void listarContatos(ArrayList<Contato> lista){
        
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }
        
        System.out.printf("\n%-24s | %-15s | %-10s", "Nome", "Telefone", "Email");
        
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("\n%-24s | %-15s | %-10s",
                lista.get(i).getNome(), lista.get(i).getTelefone(), lista.get(i).getEmail());
        }
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.println("Digite o contato que deseja excluir: ");
        String contato = scanner.nextLine();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(contato)){
                lista.remove(i);
                System.out.println("Contato excluído!");
                return;
            }
            System.out.println("Contato não encontrado!");
        }
    }

    public static void EditarTelefone(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.println("Digite o contato que deseja editar: ");
        String contato = scanner.nextLine();
        scanner.nextLine();

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(contato)){
                System.out.println("Editar telefone: ");
                String novoTelefone = scanner.nextLine();

                lista.get(i).setTelefone(novoTelefone);
                System.out.println("Telefone atualizado!");
            }else{
                System.out.println("Contato não encontrado!");
                return;
            }

        }
    }
}

 
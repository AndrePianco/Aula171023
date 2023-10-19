package ClassesQ4;
import java.util.Scanner;


public class Main {
    public static Scanner sc1 = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Informe o nome da pessoa:");
        pessoa.setNome(sc1.nextLine());
        System.out.println("Data de nascimento da pessoa:");
        System.out.print("Dia: ");
        int dia = sc2.nextInt();
        System.out.print("Mês: ");
        int mes = sc2.nextInt();
        System.out.print("Ano: ");
        int ano = sc2.nextInt();
        pessoa.setarData(dia, mes, ano);
        System.out.println("Contato da pessoa:");
        System.out.print("Telefone residencial: ");
        String tel = sc1.nextLine();
        System.out.print("Celular: ");
        String cel = sc1.nextLine();
        System.out.print("Email: ");
        String ema = sc1.nextLine();
        pessoa.setarContato(tel, cel, ema);
        System.out.println("Endereço da pessoa:");
        System.out.print("Logradouro: ");
        String log = sc1.nextLine();
        System.out.print("Numero: ");
        int num = sc2.nextInt();
        System.out.print("Bairro: ");
        String bair = sc1.nextLine();
        System.out.print("Cidade: ");
        String cida = sc1.nextLine();
        System.out.print("Estado: ");
        String estad = sc1.nextLine();
        System.out.print("Cep: ");
        String cep = sc1.nextLine();
        pessoa.setarEndereco(log, num, bair, cida, estad, cep);

        System.out.println("Dados da pessoa: ");
        System.out.print("Nome: "+pessoa.getNome()+"\n");
        System.out.print("Data de nascimento: "+pessoa.getDataNasc().getDia()+"/"+pessoa.getDataNasc().getMes()+"/"+pessoa.getDataNasc().getAno());
        System.out.println("\nContato:");
        System.out.println("Telefone residencial: "+pessoa.getContato().getTelefResidenci());
        System.out.println("Celular: "+pessoa.getContato().getCelular());
        System.out.println("Email: "+pessoa.getContato().getEmail());
        System.out.println("Endereco:");
        System.out.println("Logradouro: "+pessoa.getEndereco().getLogradouro());
        System.out.println("Numero: "+pessoa.getEndereco().getNumero());
        System.out.println("Cidade: "+pessoa.getEndereco().getCidade());
        System.out.println("Estado: "+pessoa.getEndereco().getEstado());
        System.out.println("Cep: "+pessoa.getEndereco().getCep());

    }
}
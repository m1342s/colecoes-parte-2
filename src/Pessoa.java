import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private static void addPessoa(){
      List<DadosPessoa> pessoas = new ArrayList<DadosPessoa>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      String nome = sc.nextLine();
      System.out.println("Digite seu sexo: ");
      String sexo = sc.nextLine();
      List<DadosPessoa> listaFeminino= new ArrayList<DadosPessoa>();
      List<DadosPessoa> listaMasculino= new ArrayList<DadosPessoa>();
      if(nome.equals("Feminino")){
          listaFeminino.add()
      }
     else if(nome.equals("Masculino")){
         listaMasculino.add()
      }

    }
}

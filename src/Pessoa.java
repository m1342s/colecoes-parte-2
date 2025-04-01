import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
            List<DadosPessoa> pessoas = new ArrayList<>();
            List<DadosPessoa> listaFeminino = new ArrayList<DadosPessoa>();
            List<DadosPessoa> listaMasculino = new ArrayList<DadosPessoa>();

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a quantidade de pessoas que deseja cadastrar: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite o sexo: ");
                String sexo = sc.nextLine();

                DadosPessoa pessoa = new DadosPessoa(nome, sexo);
                pessoas.add(pessoa);
                if (sexo.equalsIgnoreCase("Masculino")) {
                    listaMasculino.add(pessoa);
                } else if (sexo.equalsIgnoreCase("Feminino")) {
                    listaFeminino.add(pessoa);
                }
            }
            System.out.println(listaFeminino);
            System.out.println(listaMasculino);


        }
    }


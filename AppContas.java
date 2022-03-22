import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class AppContas {
    public static void main(String[] args) throws IOException {
        String mostra = "";
        String nomeArq = "C:\\Users\\Usuario\\Desktop\\ProjetoItau\\cliente.txt";
        String linha = "";
        File arq = new File(nomeArq);
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Clientes> cliente = new ArrayList<Clientes>();

        while (opcao != 5) {
            System.out.println("Gama Academy - Projeto Itau");
            System.out.println("1 - Cadastrar Clientes");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Gravar em arquivo texto");
            System.out.println("4 - Consultar arquivo texto");
            System.out.println("5 - Sair");
            System.out.println("Digite sua opcao");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com o nome: ");
                    String nome = teclado.next();

                    System.out.println("Entre com a Agência: ");
                    int agencia = teclado.nextInt();

                    System.out.println("Entre com a Conta: ");
                    int conta = teclado.nextInt();

                    System.out.println("Entre com o email: ");
                    String email = teclado.next();

                    System.out.println("Entre com o telefone: ");
                    int telefone = teclado.nextInt();

                    System.out.println("Entre com o saldo: ");
                    float saldo = teclado.nextFloat();

                    Clientes c = new Clientes();
                    c.setNome(nome);
                    c.setAgencia(agencia);
                    c.setConta(conta);
                    c.setEmail(email);
                    c.setTelefone(telefone);
                    c.setSaldo(saldo);

                    cliente.add(c);

                    break;

                case 2:
                    for (int i = 0; i < cliente.size(); i++) {
                        Clientes c1 = cliente.get(i);
                        System.out.println(
                                "Cliente: " + c1.getNome() + " Ag: " + c1.getAgencia() + " Cc: " + c1.getConta()
                                        + " Email: " + c1.getEmail() + " Telefone: " + c1.getTelefone() + " Saldo: "
                                        + "R$ " + c1.getSaldo());
                    }
                    break;
                case 3:
                    FileWriter arquivo = new FileWriter("C:\\Users\\Usuario\\Desktop\\ProjetoItau\\cliente.txt");
                    PrintWriter gravarArquivo = new PrintWriter(arquivo);

                    gravarArquivo.printf("Registros dos Clientes%n");
                    gravarArquivo.printf("Nome dos Clientes" + "%n");

                    for (int i = 0; i < cliente.size(); i++) {
                        Clientes c1 = cliente.get(i);
                        gravarArquivo
                                .printf("Cliente: " + c1.getNome() + " Ag: " + c1.getAgencia() + " Cc: " + c1.getConta()
                                        + " Email: " + c1.getEmail() + " Telefone: " + c1.getTelefone() + " Saldo: "
                                        + "R$ " + c1.getSaldo() + "%n");
                    }
                    arquivo.close();
                    System.out.println(
                            "O arquivo esta sendo gravado na unidade C:\\Users\\Usuario\\Desktop\\ProjetoItau\\cliente.txt");
                    break;
                case 4:
                    if (arq.exists()) {
                        mostra = "Arquivo - " + arq + ",aberto com sucesso";
                        mostra = "Tamanho do Arquivo - " + Long.toString(arq.length()) + " Bytes \n";

                        try {
                            FileReader reader = new FileReader(nomeArq);

                            BufferedReader leitor = new BufferedReader(reader);
                            while (true) {
                                linha = leitor.readLine();
                                System.out.println(linha);
                                if (linha == null)
                                    break;
                                mostra += linha + "\n";
                            }
                        } catch (Exception erro) {
                        }

                        JOptionPane.showMessageDialog(null, mostra, "Arquivo...", 1);
                    } else

                        JOptionPane.showMessageDialog(null, "Arquivo Inexistente", "Erro", 0);
                    break;

                case 5:
                    System.out.println("Sessão encerrada");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        }

        teclado.close();
    }
}

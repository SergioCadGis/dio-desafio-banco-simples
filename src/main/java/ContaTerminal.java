import java.util.Locale;
import java.util.Scanner;

/**Classe Main
  *@author Sergio Pedro de Souza
  *@version 1.0
  *since Release 28/08/2024
  */

public class ContaTerminal {
  int numero = 1021;
  String agencia = "067-8";
  String nomeCliente = "Sergio Pedro";
  double saldo = 237.12;

  public static void main(String[] args) {
      Main minhaConta = new Main();

      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      // Solicitando os dados ao usuário
      System.out.print("Digite o número da conta: ");
       minhaConta.numero = scanner.nextInt();

      System.out.print("Digite a agencia da conta: ");
       minhaConta.agencia = scanner.next();
      
      System.out.print("Digite seu nome: ");
       minhaConta.nomeCliente = scanner.next();
  
      //System.out.print("Digite seu Saldo: ");
      //minhaConta.saldo = scanner.nextDouble();
    
    //System.out.println("Digite o Número da Conta: " + minhaConta.numero);
    //System.out.println("Digite oAgência: " + minhaConta.agencia);
    //System.out.println("Digite seu Nome: " + minhaConta.nomeCliente);
    //System.out.println("Saldo: R$ " + minhaConta.saldo);

    System.out.println("Olá " + minhaConta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + minhaConta.agencia  + ", conta " + minhaConta.numero + " e seu saldo " +  minhaConta.saldo + " já está disponível para saque!");
    
    System.out.println("Fim do programa!");

  }
  
  

}

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    
   public static void main(String[] args) {
      Banco banco = new Banco("Banco nome");
      
      Cliente joao = new Cliente();
      joao.setNome("Joao");

      Conta cc = new ContaCorrente(joao);
      Conta poupanca = new ContaPoupanca(joao);

      cc.depositar(100);
      cc.transferir(poupanca, 50);

      cc.imprimirExtrato();
      poupanca.imprimirExtrato();

      banco.addConta(cc);
      banco.addConta(poupanca);

      banco.imprimirContas();

   }
}

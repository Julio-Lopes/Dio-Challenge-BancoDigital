package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void addConta(Conta conta) {
        contas.add(conta);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirContas(){
        for (Conta conta : contas) {
            System.out.println("=== Contas " + nome + " ===");
            System.out.println(String.format("Titular: %s", conta.cliente.nome ));
            System.out.println(String.format("Agencia: %d", conta.agencia ));
            System.out.println(String.format("Conta: %d", conta.numero ));
        }
    }
}
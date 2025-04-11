package br.edu.up.calculadora.math;

import br.edu.up.calculadora.modelos.*;

public class Calculadora {
    public static void calcularDesconto(Cliente cliente, Produto produto, Integer quantidade) {
       var total = produto.getPreco() * quantidade;

       if(total > 60.00) {
           total *= 0.90;
       }

        System.out.println(String.format("Parabéns %s!\nO valor da compra é de %f\n\n" +
                "O comprovante será enviado para o email %s", cliente.getNome(), total, cliente.getEmail()));
    }
}

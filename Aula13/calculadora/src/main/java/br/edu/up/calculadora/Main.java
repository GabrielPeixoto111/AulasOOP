package br.edu.up.calculadora;

import br.edu.up.calculadora.math.Calculadora;
import br.edu.up.calculadora.modelos.Cliente;
import br.edu.up.calculadora.modelos.Produto;

public class Main {
    public static void main(String[] args) {
        var p = new Produto("Leite", 10.00);
        var c = new Cliente("João", "joao@gmail.com.br");

        p.exibirDetalhes();
        c.exibirDetalhes();

        Calculadora.calcularDesconto(c, p, 10);
    }
}

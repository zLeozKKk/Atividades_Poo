package Heranca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();

        // Adiciona Pessoa Física
        listaPessoas.add(new PessoaFisica("Leonardo", "123.456.789-00", LocalDate.of(2000, 5, 15)));
        
        // Adiciona Pessoa Jurídica (Razão Social, Ano de Fundação, CNPJ)
        listaPessoas.add(new PessoaJuridica("Uber Brasil", 2009, "12.345.678/0001-99"));

        // Exibe o ID e o tipo de cada pessoa na lista
        for (Pessoa p : listaPessoas) {
            System.out.println("ID: " + p.getId());
        }
    }
}
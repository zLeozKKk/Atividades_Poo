package Heranca;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    

    private String nome;
    private String cpf;
    private LocalDate dataN; 

    public PessoaFisica(String nome, String cpf, LocalDate dataN) {
            super();
            this.nome = nome;
            this.cpf = cpf;
            this.dataN = dataN;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataN() {
        return dataN;
    }

    public void setDataN(LocalDate dataN) {
        this.dataN = dataN;
    }

    
    

    
}

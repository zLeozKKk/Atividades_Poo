package Heranca;

import java.util.List;

public abstract class Pessoa {

    private static int idInicial = 100; 
    private int id;

    public Pessoa() {
        this.id = idInicial;
        idInicial++;
    }
    
    public int getId() {
        return id;
    }

    public static Pessoa localizaPessoa (List<Pessoa> listaPessoas, int idProcurado){
            for(Pessoa p : listaPessoas ){
                if(p.getId() == idProcurado){
                    return p;
                }
            }return null;
        }

    public static Pessoa localizaPorDocumento(List<Pessoa> lista, String documento) {
    for (Pessoa p : lista) {
        if (p instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) p;
            if (pf.getCpf().equals(documento)) {
                return pf;
            }
        } 
        else if (p instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) p;
            if (pj.getCnpj().equals(documento)) {
                return pj;
            }
        }
    }
    return null; 
}
}

import java.util.ArrayList;
import java.util.List;
public class CadastroCliente {
    
    List<Cliente> clientes;

    public CadastroCliente() {
        clientes = new ArrayList<>();
    }
    public void adicionarClientes (Cliente cliente){
        clientes.add(cliente);
    }

    public String listarClientes(){
        String relatorio;
        relatorio = " --- Listando os CLIENTES ---\n";
        for( Cliente listando : clientes){
            relatorio+= "Nome: " + listando.getNome() 
                      + " | Mensalidade: R$ " + String.format("%.2f", listando.getMensalidade()) + "\n";
        }
        return relatorio;
    }
}

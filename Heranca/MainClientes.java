public class MainClientes {

    public static void main(String[] args) {

        // 1. Instancia o seu cadastro de clientes
        CadastroCliente cadastro = new CadastroCliente();

        // 2. Cria instâncias de clientes (físicos e jurídicos)
        // Cliente Físico com menos de 60 anos (10% do salário = R$ 300.00)
        ClienteFisico cf1 = new ClienteFisico("Leonardo", 25, 3000.0);

        // Cliente Físico com 60 anos ou mais (15% do salário = R$ 750.00)
        ClienteFisico cf2 = new ClienteFisico("Maria", 65, 5000.0);

        // Cliente Jurídico (mensalidade combinada/negociada = R$ 1200.00)
        ClienteJuridico cj1 = new ClienteJuridico("Tech Solutions LTDA", 1200.0);

        // 3. Adiciona os clientes usando o seu método 'adicionarClientes'
        cadastro.adicionarClientes(cf1);
        cadastro.adicionarClientes(cf2);
        cadastro.adicionarClientes(cj1);

        // 4. Obtém o relatório em String usando 'listarClientes' e imprime no console
        String relatorio = cadastro.listarClientes();
        System.out.println(relatorio);
    }
}
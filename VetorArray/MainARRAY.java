public class MainARRAY {

    public static void main(String[] args) {
        // 1. Instancia a concessionária (com ArrayList não precisa passar tamanho!)
        ConcessionariaA concessionaria = new ConcessionariaA();

        // 2. Cria os objetos de teste
        Carro c1 = new Carro(45000.0, 2020, 5.80, "ABC-1234");
        Carro c2 = new Carro(110000.0, 2022, 6.10, "XYZ-9876");
        Carro c3 = new Carro(95000.0, 2021, 5.90, "KML-5555");

        System.out.println("--- 1. ADICIONANDO CARROS ---");
        concessionaria.addCarro(c1);
        concessionaria.addCarro(c2);
        concessionaria.addCarro(c3);

        System.out.println("\n--- 2. CONSULTANDO O ARRAYLIST ---");
        concessionaria.consultarCarros();

        System.out.println("\n--- 3. BUSCANDO POR PLACA ---");
        Carro encontrado = concessionaria.consultarPlaca("XYZ-9876");
        if (encontrado != null) {
            System.out.println("Carro encontrado: " + encontrado);
        } else {
            System.out.println("Placa não localizada.");
        }

        System.out.println("\n--- 4. REMOVENDO UM CARRO ---");
        concessionaria.removerCarro(c2);

        System.out.println("\n--- 5. CONSULTANDO APÓS REMOÇÃO ---");
        concessionaria.consultarCarros();

         concessionaria.toString();
    }
}
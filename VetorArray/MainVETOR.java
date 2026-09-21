public class MainVETOR {

    public static void main(String[] args) {
        // 1. Instancia a concessionária com espaço para até 3 carros
        ConcessionariaV concessionaria = new ConcessionariaV(3);

        // 2. Instancia os objetos Carro para teste
        Carro c1 = new Carro(45000.0, 2020, 5.80, "ABC-1234");
        Carro c2 = new Carro(110000.0, 2022, 6.10, "XYZ-9876");
        Carro c3 = new Carro(95000.0, 2021, 5.90, "KML-5555");

        System.out.println("--- 1. ADICIONANDO CARROS ---");
        concessionaria.adcCarro(c1);
        concessionaria.adcCarro(c2);
        concessionaria.adcCarro(c3);

        System.out.println("\n--- 2. CONSULTANDO O VETOR COMPLETO ---");
        concessionaria.consultaCarrosVetor();

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
        concessionaria.consultaCarrosVetor();

        concessionaria.toString();
    }
}
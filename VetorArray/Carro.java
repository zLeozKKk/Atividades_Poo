public class Carro {
    
    private double valor;
    private Cores cor;
    private int ano;
    private double valorGasolina; 
    private String placa;

    // criando os atributos de um carro
    public Carro(double valor, int ano , double valorGasolina , String placa) {

        this.cor = Cores.BRANCO;
        this.valor = valor;
        this.ano = ano;
        this.valorGasolina = valorGasolina;
        this.placa = placa;
        
    }

    // criando os gets e sets ( alguns sets estão em metodos);

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cores getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // enum para os tipos de cores

    public enum Cores {
        BRANCO, 
        PRETO,
        VERMELHO,
        CINZA;
    }

    public double kmPorLitro(double kmRodados, double litrosGastos) {
        double consumo = kmRodados / litrosGastos;
        
        // colocar um syso com a variavel de resposta
        System.out.println("O consumo do carro foi de: " + consumo + " km/l");
        
        return consumo; // retornar a variavel resultante
    }

    public void trocandoCor (Cores novaCor){

        // insere uma nova cor
        // ele escolheu a mesma cor??
        if (this.cor == novaCor){
            System.out.println("O seu carro já é da cor " + novaCor);
            return;
        } 

        // se for diferente, modifica
        this.cor = novaCor;
    }

    @Override
    public String toString() {
    return "Carro {" +
            "Placa='" + placa + '\'' +
            ", Ano=" + ano +
            ", Valor=R$" + valor +
            ", Cor=" + cor +
            '}';
}

}

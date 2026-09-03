package heranca;
public class Premier extends Executive {

	public Premier(String cpf, String nome, String assento, double custoPassagem) {
        super(cpf, nome, assento, custoPassagem);
		setMilhas(custoPassagem*0.20);
    }

	@Override
	public double custoBagagem(int qnt, int [] pesos) {
		double desconto = super.custoBagagem(qnt, pesos);

		return desconto*0.50;
    }
	
	@Override
	public double defineAssento(String a) {
        setAssento(a);
        return 0.0;
    }
	

}

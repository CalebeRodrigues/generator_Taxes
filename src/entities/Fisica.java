package entities;

public class Fisica extends Tax_People {
	
	private Double gastoSaude;
	
	public Fisica() {
		super();
	}

	public Fisica(String name, Double renda, Double gastoSaude) {
		super(name, renda);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calculoImposto() {
		double valorAbatido = 0.0;
		double valorImposto;
		
		if(gastoSaude > 0.0) valorAbatido = gastoSaude * 0.5;
		
		if(renda < 20000.00) valorImposto = renda * 0.15 - valorAbatido;
		else valorImposto = renda * 0.25 - valorAbatido;
		
		return valorImposto;
	}

	@Override
	public String ToString() {
		return super.ToString() + String.format("%.2f", calculoImposto());
	}
}

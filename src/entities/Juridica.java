package entities;

public class Juridica extends Tax_People{
	
	private int nFuncionarios; 
	
	public Juridica() {
		super();
	}
		
	public Juridica(String name, Double renda, int nFuncionarios) {
		super(name, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public Double calculoImposto() {
		double valor;
		if(nFuncionarios >= 10) {
			valor = renda * 0.14;
		}
		else {
			valor = renda * 0.16;
		}
		return valor;
	}

}

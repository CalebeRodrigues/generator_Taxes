package entities;

public abstract class Tax_People {
	private String name;
	protected Double renda;
	
	public Tax_People() {
		
	}
	
	public Tax_People(String name, Double renda) {
		this.name = name;
		this.renda = renda;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public abstract Double calculoImposto();
}

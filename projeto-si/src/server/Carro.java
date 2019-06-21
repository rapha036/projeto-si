package server;

public class Carro {
	
	private int id;
	private String nome, placa;
	private boolean restricao;
	private double precoLocacaoPorSeg;
	private Locadora disponivelEmLocadora;
	
	/***************
	 * CONSTRUCTOR *
	 ***************/
	
	public Carro(int id, String nome, String placa, boolean restricao, double precoLocacaoPorSeg,
			Locadora disponivelEmLocadora) {
		super();
		this.id = id;
		this.nome = nome;
		this.placa = placa;
		this.restricao = restricao;
		this.precoLocacaoPorSeg = precoLocacaoPorSeg;
		this.disponivelEmLocadora = disponivelEmLocadora;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public boolean isRestricao() {
		return restricao;
	}
	
	public void setRestricao(boolean restricao) {
		this.restricao = restricao;
	}
	
	public double getPrecoLocacaoPorSeg() {
		return precoLocacaoPorSeg;
	}
	
	public void setPrecoLocacaoPorSeg(double precoLocacaoPorSeg) {
		this.precoLocacaoPorSeg = precoLocacaoPorSeg;
	}
	
	
	
	
}

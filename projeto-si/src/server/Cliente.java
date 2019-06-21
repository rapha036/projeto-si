package server;

public class Cliente {
	
	private int id;
	private String nome, rg, categoriaHabilitacao;
	
	
	
	public Cliente(int id, String nome, String rg, String categoriaHabilitacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCategoriaHabilitacao() {
		return categoriaHabilitacao;
	}

	public void setCategoriaHabilitacao(String categoriaHabilitacao) {
		this.categoriaHabilitacao = categoriaHabilitacao;
	}
	
	
}

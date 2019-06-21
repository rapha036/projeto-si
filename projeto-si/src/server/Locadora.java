package server;

import java.util.List;

public class Locadora {
	
	private int id;
	private String nome;
	private List<Locacao> locacoes;
	private List<Carro> carros;
	
	
	public Locadora(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
	
	
	
	
	
	
	
	
	
}
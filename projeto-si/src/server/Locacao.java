package server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locacao implements Serializable {
	
	private static final long serialVersionUID = -5594330145422239039L;
	
	private double valor;
	private Cliente cliente;
	private Carro carro;
	private Locadora locadoraDevolucao;
	private String horaLocaocao, horaDevolucao;
	
	/***************
	 * CONSTRUCTOR *
	 ***************/
	
	public Locacao(double valor, Cliente cliente, Carro carro, Locadora locadoraDevolucao, String horaLocaocao,
			String horaDevolucao) {
		super();
		this.valor = valor;
		this.cliente = cliente;
		this.carro = carro;
		this.locadoraDevolucao = locadoraDevolucao;
		this.horaLocaocao = horaLocaocao;
		this.horaDevolucao = horaDevolucao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Locadora getLocadoraDevolucao() {
		return locadoraDevolucao;
	}

	public void setLocadoraDevolucao(Locadora locadoraDevolucao) {
		this.locadoraDevolucao = locadoraDevolucao;
	}

	public String getHoraLocaocao() {
		return horaLocaocao;
	}

	public void setHoraLocaocao(String horaLocaocao) {
		this.horaLocaocao = horaLocaocao;
	}

	public String getHoraDevolucao() {
		return horaDevolucao;
	}

	public void setHoraDevolucao(String horaDevolucao) {
		this.horaDevolucao = horaDevolucao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

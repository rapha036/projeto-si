package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainServer extends UnicastRemoteObject implements LocadoraRemota {
    
	
    
	private Locadora[] locadorasCliente; //quantidade de locadoras permitidas para acessar o servidor;
	private Carro[] carros;
	
	int proximaLocadora;
	int proximoCarro;
	
	public MainServer(int tamanho) throws RemoteException {
			
			super();
			
			this.locadorasCliente = new Locadora[tamanho];
			this.proximaLocadora = 0;
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			MainServer ms = new MainServer(10);
			Registry r = LocateRegistry.createRegistry(2126);
			Naming.rebind("rmi://localhost:2126/ms", ms);
			System.out.println("Servidor no ar!");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		}
		
		
	}

	@Override
	public void cadastrarLocadora(int id, String nome) throws RemoteException {
		// TODO Auto-generated method stub
				
		if (this.proximaLocadora == this.locadoras.length) {
			proximaLocadora = 0;	
		}
		
		locadoras[proximaLocadora] = new Locadora(id, nome);
		proximaLocadora++;
		
		new Excecao("Locadora \"" + nome + "\" inserida com sucesso!");
		
		for(locadora[proximaLocadora] : locadoras) {
		    
		    
		}
		
	}

	@Override
	public void cadastrarCarro(int id, String nome, String placa, boolean restricao,  double precoLocacaoPorSeg, String nomeLocadora) throws RemoteException {
		// TODO Auto-generated method stub
		//if (this.proximoCarro == this.carros.length) {
		//	proximoCarro = 0;	
		//}
		
		-- > Carro carro = new Carro(id, nome, placa, restricao, precoLocacaoPorSeg);
		
		insereCarroLocadora(carro, nomeLocadora);
		
		//carros[proximoCarro] = new Locadora(id, nome);
		//proxima++;
		
		new Excecao("Carro \"" + nome + "\" cadastrado na " + nomeLocadora + " com sucesso!");
	}

	@Override
	public void cadastrarClientes() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarCarros() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarCarrosRestricao() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarLocacoesLocadora() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarLocacoesCliente() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	

}
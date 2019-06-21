package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainServer extends UnicastRemoteObject implements LocadoraRemota {
    
	
	
	private Locadora[] locadoras;
	int proxima;
	
	public MainServer(int tamanho) throws RemoteException {
			
			super();
			
			this.locadoras = new Locadora[tamanho];
			this.proxima = 0;
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
		Locadora locadora = new Locadora();
		
	}

	@Override
	public void cadastrarCarros() throws RemoteException {
		// TODO Auto-generated method stub
		
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
package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LocadoraRemota extends Remote {
	
	 
	 public void cadastrarLocadora() throws RemoteException;
	 
	 public void cadastrarCarros() throws RemoteException;
	 
	 public void cadastrarClientes() throws RemoteException;
	 
	 public void listarCarros() throws RemoteException;
	 
	 public void listarCarrosRestricao() throws RemoteException;
	 
	 public  void listarLocacoesLocadora() throws RemoteException;
	 
	 public void listarLocacoesCliente() throws RemoteException;
		
	
}

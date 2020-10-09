package DAO;

import java.sql.ResultSet;
import java.util.List;

import model.Cliente;

public interface ClienteDAO {
	
	public void adicionarCliente(Cliente cliente);
	
	public ResultSet getCliente(int id);
	
	public void removerCliente(int id);
	
	public void atualizarCliente(Cliente cliente);
	
	public List<Cliente> getTodosClientes();
	
	public ResultSet GetClienteSemEmail();
	
}

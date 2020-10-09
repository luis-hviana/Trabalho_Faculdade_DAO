package DAO;

import java.sql.ResultSet;
import java.util.List;

import model.Distribuidor;

public interface DistribuidorDAO {
	
	public void adicionarDistribuidor(Distribuidor distribuidor);
	
	public ResultSet getDistribuidor(int id);
	
	public void removerDistribuidor(int id);
	
	public void atualizarDistribuidor(Distribuidor distribuidor);
	
	public List<Distribuidor> getTodosDistribuidores();
}

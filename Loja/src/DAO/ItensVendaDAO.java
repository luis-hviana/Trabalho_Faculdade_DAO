package DAO;

import java.sql.ResultSet;
import java.util.List;

import model.ItensVenda;

public interface ItensVendaDAO {
	
	public void adicionarItensVenda(ItensVenda itvenda);
	
	public ResultSet getItensVenda(int id);
	
	public void removerItensVenda(int id);
	
	public void atualizarItensVenda(ItensVenda itvenda);
	
	public List<ItensVenda> getTodosItensVenda();
	
}

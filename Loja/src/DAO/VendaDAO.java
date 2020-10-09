package DAO;

import java.sql.ResultSet;
import java.util.List;

import model.Venda;

public interface VendaDAO {

	public void adicionarVenda(Venda venda);
	
	public ResultSet getVenda(int id);
	
	public void removerVenda(int id);
	
	public void atualizarVenda(Venda venda);
	
	public List<Venda> getTodasVendas();
	
	public List<Venda> GetVendasAno();
}

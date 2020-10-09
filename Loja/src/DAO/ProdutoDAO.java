package DAO;

import java.sql.ResultSet;
import java.util.List;

import model.Produto;

public interface ProdutoDAO {
	
	public void adicionarProduto(Produto produto);
	
	public ResultSet getProduto(int id);
	
	public void removerProduto(int id);
	
	public void atualizarProduto(Produto produto);
	
	public List<Produto> getTodosProdutos();
	
	public List<Produto> getProdutosVencidos();
	
}

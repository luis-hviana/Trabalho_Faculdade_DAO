package model;

public class ItensVenda {
	private int fk_cod_venda;
    private int fk_cod_produto;
    private int quantidade;
    private double sub_total;
    
	public int getFk_cod_venda() {
		return fk_cod_venda;
	}
	
	public void setFk_cod_venda(int fk_cod_venda) {
		this.fk_cod_venda = fk_cod_venda;
	}
	

	
	public int getFk_cod_produto() {
		return fk_cod_produto;
	}

	public void setFk_cod_produto(int fk_cod_produto) {
		this.fk_cod_produto = fk_cod_produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getSub_total() {
		return sub_total;
	}
	
	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}
    
    
	
}

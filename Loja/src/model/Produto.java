package model;

import java.util.Date;

public class Produto {
	private int pk_cod_produto;
    private int fk_cod_dist;
    private int estoque;
    private String descricao;
    private String data_validade;
    private double preco_custo;
    
	public int getPk_cod_produto() {
		return pk_cod_produto;
	}
	
	public void setPk_cod_produto(int pk_cod_produto) {
		this.pk_cod_produto = pk_cod_produto;
	}
	
	public int getFk_cod_dist() {
		return fk_cod_dist;
	}
	
	public void setFk_cod_dist(int fk_cod_dist) {
		this.fk_cod_dist = fk_cod_dist;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData_validade() {
		return data_validade;
	}
	
	public void setData_validade(String string) {
		this.data_validade = string;
	}
	
	public double getPreco_custo() {
		return preco_custo;
	}
	
	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}
    
    

}

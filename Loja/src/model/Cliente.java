package model;

import java.util.Date;

public class Cliente {
	private int pk_cod_cliente;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String data_nasc;
    
    
	public int getPk_cod_cliente() {
		return pk_cod_cliente;
	}
	
	public void setPk_cod_cliente(int pk_cod_cliente) {
		this.pk_cod_cliente = pk_cod_cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getData_nasc() {
		return data_nasc;
	}
	
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}

    
}

package model;

public class Distribuidor {
	private int pk_cod_dist;
    private String nome_fantasia;
    private String email;
    private String razao_social;
    private String telefone;
    
	public int getPk_cod_dist() {
		return pk_cod_dist;
	}
	
	public void setPk_cod_dist(int pk_cod_dist) {
		this.pk_cod_dist = pk_cod_dist;
	}
	
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRazao_social() {
		return razao_social;
	}
	
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
    

}

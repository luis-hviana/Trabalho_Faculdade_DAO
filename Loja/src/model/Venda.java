package model;

public class Venda {
	
	private int pk_cod_venda;
    private int fk_cod_cliente;
    private String data_venda;
    private String hora_venda;
    private double total;
    
	public int getPk_cod_venda() {
		return pk_cod_venda;
	}
	
	public void setPk_cod_venda(int pk_cod_venda) {
		this.pk_cod_venda = pk_cod_venda;
	}
	
	public int getFk_cod_cliente() {
		return fk_cod_cliente;
	}
	
	public void setFk_cod_cliente(int fk_cod_cliente) {
		this.fk_cod_cliente = fk_cod_cliente;
	}
	

	public String getData_venda() {
		return data_venda;
	}

	public void setData_venda(String data_venda) {
		this.data_venda = data_venda;
	}

	public String getHora_venda() {
		return hora_venda;
	}

	public void setHora_venda(String hora_venda) {
		this.hora_venda = hora_venda;
	}

	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
    
    

}

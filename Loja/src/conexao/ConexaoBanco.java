package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.xml.CDATA;

import DAO.ClienteDAO;
import DAO.DistribuidorDAO;
import DAO.ItensVendaDAO;
import DAO.ProdutoDAO;
import DAO.VendaDAO;
import Date.Conversor;
import model.Cliente;
import model.Distribuidor;
import model.ItensVenda;
import model.Produto;
import model.Venda;

public class ConexaoBanco implements ClienteDAO, DistribuidorDAO, ProdutoDAO, ItensVendaDAO, VendaDAO {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	public ConexaoBanco() {
		url = "jdbc:postgresql://localhost:5432/Loja";
		usuario = "postgres";
		senha = "12345678";
		
		try { 
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("conexão realizada com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
 // --------------------------------------------- CLIENTE -----------------------------------------
	
	@Override
	public void adicionarCliente(Cliente c) {
		
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("insert into cliente(pk_cod_cliente, nome, email, telefone, data_nasc, endereco) "
					+ "values ('" + c.getPk_cod_cliente() + "','" + c.getNome() + "','" + c.getEmail() + "','" + c.getTelefone() + "','" + c.getData_nasc() + "','" + c.getEndereco() + "')");
			
			System.out.println("Cliente adicionado com sucesso");
					
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public ResultSet getCliente(int idCliente) {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from cliente where pk_cod_cliente = '" + idCliente + "'");
			while(rs.next()) {
				int id = rs.getInt("pk_cod_cliente");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String telefone = rs.getString("telefone");
				String data_nasc = rs.getString("data_nasc");
				String endereco = rs.getString("endereco");
				
				System.out.println(id + " - " + nome + " - " + email + " - " + telefone + " - " + data_nasc + " - " + endereco);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public void removerCliente(int id) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("delete from cliente where pk_cod_cliente = '" + id +  "'");
			System.out.println("Cliente removido com sucesso");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void atualizarCliente(Cliente cliente) { }

	@Override
	public List<Cliente> getTodosClientes() {
		List<Cliente> resultado = new ArrayList<Cliente>();
		
		try {
			Statement smt = con.createStatement();
			 ResultSet rs = smt.executeQuery("select * from cliente");
			 
			 while (rs.next()) {
		            
		            Cliente c = new Cliente();
		            c.setPk_cod_cliente(rs.getInt("pk_cod_cliente"));
		            c.setNome(rs.getString("nome"));
		            c.setEmail(rs.getString("email"));
		            c.setTelefone(rs.getString("telefone"));
		            c.setData_nasc(rs.getString("data_nasc"));
		            c.setEndereco(rs.getString("endereco"));
		            
		            resultado.add(c);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		}
	}
	
	@Override
	public ResultSet GetClienteSemEmail() {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from cliente where email = '' ");
			while(rs.next()) {
				int id = rs.getInt("pk_cod_cliente");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");
				String data_nasc = rs.getString("data_nasc");
				String endereco = rs.getString("endereco");
				
				System.out.println(id + " - " + nome + " - " + telefone + " - " + data_nasc + " - " + endereco);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	
		
	// --------------------------------------------- DISTRIBUIDOR -----------------------------------------
	
	@Override
	public void adicionarDistribuidor(Distribuidor dt) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("insert into dist(pk_cod_dist, nome_fantasia, email, telefone, razao_social) "
					+ "values ('" + dt.getPk_cod_dist() + "','" + dt.getNome_fantasia() + "','" + dt.getEmail() + "','" + dt.getTelefone() + "','"  + dt.getRazao_social() + "')");
			
			System.out.println("Distribuidor adicionado com sucesso");
					
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public ResultSet getDistribuidor(int idDist) {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from dist where pk_cod_dist = '" + idDist + "'");
			
			while(rs.next()) {
				int id = rs.getInt("pk_cod_dist");
				String nome = rs.getString("nome_fantasia");
				String email = rs.getString("email");
				String telefone = rs.getString("telefone");
				String razao_social = rs.getString("razao_social");
				
				System.out.println(id + " - " + nome + " - " + email + " - " + telefone + " - " + razao_social);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}

	@Override
	public void removerDistribuidor(int id) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("delete from dist where pk_cod_dist = '" + id +  "'");
			System.out.println("Distribuidor removido com sucesso");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void atualizarDistribuidor(Distribuidor dis) {	}

	@Override
	public List<Distribuidor> getTodosDistribuidores() {
		List<Distribuidor> resultado = new ArrayList<Distribuidor>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from dist");
			 
			 while (rs.next()) {
		            
		            Distribuidor d = new Distribuidor();
		            d.setPk_cod_dist(rs.getInt("pk_cod_dist"));
		            d.setNome_fantasia(rs.getString("nome_fantasia"));
		            d.setEmail(rs.getString("email"));
		            d.setTelefone(rs.getString("telefone"));
		            d.setRazao_social(rs.getString("razao_social"));
		            
		            resultado.add(d);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		}
	}

	
	
	
	
	// --------------------------------------------- PRODUTO -----------------------------------------
	
	@Override
	public void adicionarProduto(Produto pr) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("insert into produto (PK_COD_PRODUTO, FK_COD_DIST, DESCRICAO, ESTOQUE, PRECO_CUSTO, DATA_VALIDADE) "
					+ "values ('" + pr.getPk_cod_produto() + "','" + pr.getFk_cod_dist() + "','" + pr.getDescricao() + "','" + pr.getEstoque() + "','" + pr.getPreco_custo() + "','" + pr.getData_validade() + "')");
					System.out.println("Produto adicionado com sucesso");
					
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	@Override
	public ResultSet getProduto(int idProd) {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from produto where pk_cod_produto = '" + idProd + "'");
			
			while(rs.next()) {
				int id = rs.getInt("pk_cod_produto");
				int fk_id = rs.getInt("fk_cod_dist");
				String descricao = rs.getString("descricao");
				int estoque = rs.getInt("estoque");
				double preco_custo = rs.getInt("preco_custo");
				String data_validade = rs.getString("data_validade");
				
				System.out.println(id + " - " + fk_id + " - " + descricao + " - " + estoque + " - " + preco_custo + " - " + data_validade);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}

	@Override
	public void removerProduto(int id) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("delete from produto where pk_cod_produto = '" + id +  "'");
			System.out.println("Produto removido com sucesso");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@Override
	public void atualizarProduto(Produto produto) {    }

	@Override
	public List<Produto> getTodosProdutos() {
		List<Produto> resultado = new ArrayList<Produto>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from produto");
			 
			 while (rs.next()) {
		            
		            Produto pr = new Produto();
		            pr.setPk_cod_produto(rs.getInt("pk_cod_produto"));
		            pr.setFk_cod_dist(rs.getInt("fk_cod_dist"));
		            pr.setEstoque(rs.getInt("estoque"));
		            pr.setDescricao(rs.getString("descricao"));
		            pr.setPreco_custo(rs.getDouble("preco_custo"));
		            pr.setData_validade(rs.getString("data_validade"));
		            
		            resultado.add(pr);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		}
	}
	@Override
	public List<Produto> getProdutosVencidos() {
		Conversor c = new Conversor();
		List<Produto> resultado = new ArrayList<Produto>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from produto where data_validade = '" + c.Data()  + "'");
			while (rs.next()) {
	            
	            Produto pr = new Produto();
	            pr.setPk_cod_produto(rs.getInt("pk_cod_produto"));
	            pr.setFk_cod_dist(rs.getInt("fk_cod_dist"));
	            pr.setDescricao(rs.getString("descricao"));
	            pr.setData_validade(rs.getString("data_validade"));
	            
	            resultado.add(pr);
			}
			
			return resultado;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		}
	
	}
	
	
	
	
	
	// --------------------------------------------- ITENS VENDA -----------------------------------------
	

	@Override
	public void adicionarItensVenda(ItensVenda itv) {
		
		
		try {
			Statement smt = con.createStatement();
			smt.executeQuery("select * from itens_venda where fk_cod_venda = '" + itv.getFk_cod_venda() + "'");
			
			try {
				smt.executeUpdate("insert into itens_venda (fk_cod_venda, fk_cod_produto, quantidade, sub_total) "
						+ "values ('" + itv.getFk_cod_venda() + "','" + itv.getFk_cod_produto() +"','" + itv.getQuantidade() + "','" + itv.getSub_total()  + "')");
				smt.executeUpdate("select totalvenda('" + itv.getFk_cod_venda() + "'" +itv.getSub_total() +  "')");
						System.out.println("Itens_venda adicionado com sucesso");
						
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
			
	}

	@Override
	public ResultSet getItensVenda(int id) {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from itens_venda where fk_cod_venda = '" + id + "'");
			
			while(rs.next()) {
				int fk_venda = rs.getInt("fk_cod_venda");
				int fk_produto = rs.getInt("fk_cod_produto");
				int quantidade = rs.getInt("quantidade");
				double sub_total = rs.getInt("sub_total");
				
				System.out.println(fk_venda + " - " + fk_produto + " - " + quantidade + " - " + sub_total);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}

	@Override
	public void removerItensVenda(int id) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("delete from itens_venda where fk_cod_venda = '" + id +  "'");
			System.out.println("Itens venda removido com sucesso");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}


	@Override
	public void atualizarItensVenda(ItensVenda itvenda) {    }

	@Override
	public List<ItensVenda> getTodosItensVenda() {
		List<ItensVenda> resultado = new ArrayList<ItensVenda>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from itens_venda");
			 
			 while (rs.next()) {
		            
		            ItensVenda itv = new ItensVenda();
		            itv.setFk_cod_venda(rs.getInt("fk_cod_venda"));
		            itv.setFk_cod_produto(rs.getInt("fk_cod_produto"));
		            itv.setQuantidade(rs.getInt("quantidade"));
		            itv.setSub_total(rs.getDouble("sub_total"));

		            resultado.add(itv);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		
		}
	}
	
	
	
	
	
	 // --------------------------------------------- VENDA -----------------------------------------
	

	@Override
	public void adicionarVenda(Venda vd) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("insert into venda (pk_cod_venda, fk_cod_cliente, data_venda, hora_venda, total) "
					+ "values ('" + vd.getPk_cod_venda() + "','" + vd.getFk_cod_cliente() + "','" + vd.getData_venda()  + "','" + vd.getHora_venda() + "','" + vd.getTotal() + "')");
					System.out.println("Venda adicionada com sucesso");
					
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public ResultSet getVenda(int id) {
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from venda where pk_cod_venda = '" + id + "'");
			
			while(rs.next()) {
				int id_venda = rs.getInt("pk_cod_venda");
				int fk_cliente = rs.getInt("fk_cod_cliente");
				String data = rs.getString("data_venda");
				String hora = rs.getString("hora_venda");
				double total = rs.getDouble("total");
				
				System.out.println(id_venda + " - " + fk_cliente + " - " + data + " - " + hora + " - " + total);
			}
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		return null;
	}

	@Override
	public void removerVenda(int id) {
		try {
			Statement smt = con.createStatement();
			smt.executeUpdate("delete from venda where pk_cod_venda = '" + id +  "'");
			System.out.println("Venda removida com sucesso");
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	@Override
	public void atualizarVenda(Venda venda) {    }

	@Override
	public List<Venda> getTodasVendas() {
		List<Venda> resultado = new ArrayList<Venda>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from venda");
			 
			 while (rs.next()) {
		            
		            Venda vd = new Venda();
		            vd.setPk_cod_venda(rs.getInt("pk_cod_venda"));
		            vd.setFk_cod_cliente(rs.getInt("fk_cod_cliente"));
		            vd.setData_venda(rs.getString("data_venda"));
		            vd.setHora_venda(rs.getString("hora_venda"));
		            vd.setTotal(rs.getDouble("total"));

		            resultado.add(vd);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		
		}
	}

	@Override
	public List<Venda> GetVendasAno() {
		List<Venda> resultado = new ArrayList<Venda>();
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from venda where data_venda between '2020-01-01 and '2020-12-31");
			 
			 while (rs.next()) {
		            Venda vd = new Venda();
		            vd.setPk_cod_venda(rs.getInt("pk_cod_venda"));
		            vd.setFk_cod_cliente(rs.getInt("fk_cod_cliente"));
		            resultado.add(vd);
			 }
			 
			 return resultado;
			 
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());  
	        return null;
		
		}
	}

	
	
}

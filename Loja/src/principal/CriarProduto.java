package principal;

import java.util.List;

import DAO.ProdutoDAO;
import conexao.ConexaoBanco;
import model.Distribuidor;
import model.Produto;

public class CriarProduto {
	
	public static void main(String[] args) {
		ProdutoDAO produtoBanco = new ConexaoBanco();
		
		Produto p1 = new Produto();
		p1.setPk_cod_produto(400);
		p1.setFk_cod_dist(500);
		p1.setEstoque(25);
		p1.setDescricao("BOLACHA");
		p1.setPreco_custo(2);
		p1.setData_validade("2023-10-05");
		
		Produto p2 = new Produto();
		p2.setPk_cod_produto(401);
		p2.setFk_cod_dist(500);
		p2.setEstoque(50);
		p2.setDescricao("ARROZ");
		p2.setPreco_custo(20);
		p2.setData_validade("2025-01-05");
		
		Produto p3 = new Produto();
		p3.setPk_cod_produto(402);
		p3.setFk_cod_dist(500);
		p3.setEstoque(40);
		p3.setDescricao("FEIJÃO");
		p3.setPreco_custo(8);
		p3.setData_validade("2022-02-12");
		
		Produto p4 = new Produto();
		p4.setPk_cod_produto(403);
		p4.setFk_cod_dist(500);
		p4.setEstoque(25);
		p4.setDescricao("MACARRÃO");
		p4.setPreco_custo(3);
		p4.setData_validade("2021-07-05");
		
		Produto p5 = new Produto();
		p5.setPk_cod_produto(404);
		p5.setFk_cod_dist(500);
		p5.setEstoque(30);
		p5.setDescricao("OLEO");
		p5.setPreco_custo(4);
		p5.setData_validade("2026-08-10");
		
		Produto p6 = new Produto();
		p6.setPk_cod_produto(405);
		p6.setFk_cod_dist(500);
		p6.setEstoque(36);
		p6.setDescricao("PIPOCA");
		p6.setPreco_custo(1.50);
		p6.setData_validade("2030-12-05");
		
		Produto p7 = new Produto();
		p7.setPk_cod_produto(406);
		p7.setFk_cod_dist(501);
		p7.setEstoque(80);
		p7.setDescricao("PÃO");
		p7.setPreco_custo(0.10);
		p7.setData_validade("2020-11-05");
		
		Produto p8 = new Produto();
		p8.setPk_cod_produto(407);
		p8.setFk_cod_dist(501);
		p8.setEstoque(15);
		p8.setDescricao("CAFÉ");
		p8.setPreco_custo(2);
		p8.setData_validade("2022-11-15");
		
		Produto p9 = new Produto();
		p9.setPk_cod_produto(408);
		p9.setFk_cod_dist(501);
		p9.setEstoque(51);
		p9.setDescricao("AÇUCAR");
		p9.setPreco_custo(2);
		p9.setData_validade("2022-10-05");
		
		Produto p10 = new Produto();
		p10.setPk_cod_produto(409);
		p10.setFk_cod_dist(501);
		p10.setEstoque(150);
		p10.setDescricao("BALA");
		p10.setPreco_custo(0.5);
		p10.setData_validade("2031-10-05");
		
		
		//produtoBanco.adicionarProduto(p10);
		
		//produtoBanco.getProduto(400);
		
		//produtoBanco.removerProduto(400);
		
		List<Produto> produto = produtoBanco.getTodosProdutos();
        
        for (int i = 0; i <= produto.size()-1; i++)
        {
        	System.out.println("------TODOS OS PRODUTOS");
            System.out.println("ID_Produto: " + produto.get(i).getPk_cod_produto());
            System.out.println("ID_Distribuidor: " + produto.get(i).getFk_cod_dist());
            System.out.println("Estoque: " + produto.get(i).getEstoque());
            System.out.println("Descrição: " + produto.get(i).getDescricao());
            System.out.println("Preço de Custo: " + produto.get(i).getPreco_custo());
            System.out.println("Data de validade: " + produto.get(i).getData_validade());
            System.out.println("------");
        } 
        
        List<Produto> prodVencidos = produtoBanco.getProdutosVencidos();
        
        for (int i = 0; i <= prodVencidos.size()-1; i++) {
        	System.out.println("------PRODUTOS VENCIDOS NA DATA ATUAL");
        	System.out.println("ID_Produto: " + prodVencidos.get(i).getPk_cod_produto());
        	System.out.println("ID_Distribuidor: " + prodVencidos.get(i).getFk_cod_dist());
        	System.out.println("Descrição: " + prodVencidos.get(i).getDescricao());
        	System.out.println("Data de validade: " + prodVencidos.get(i).getData_validade());
        	System.out.println("------");
        }
		
		
		
		
	}
}

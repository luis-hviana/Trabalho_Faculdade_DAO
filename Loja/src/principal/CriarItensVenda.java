package principal;

import java.util.List;

import DAO.ItensVendaDAO;
import conexao.ConexaoBanco;
import model.ItensVenda;
import model.Produto;

public class CriarItensVenda {
	
	public static void main(String[] args) {
		ItensVendaDAO ivendaBanco = new ConexaoBanco();
		
		ItensVenda iv1 = new ItensVenda();
		iv1.setFk_cod_venda(200);
		iv1.setFk_cod_produto(400);
		iv1.setQuantidade(1);
		iv1.setSub_total(2.99);
		
		ItensVenda iv2 = new ItensVenda();
		iv2.setFk_cod_venda(200);
		iv2.setFk_cod_produto(401);
		iv2.setQuantidade(1);
		iv2.setSub_total(20);
		
		ItensVenda iv3 = new ItensVenda();
		iv3.setFk_cod_venda(200);
		iv3.setFk_cod_produto(403);
		iv3.setQuantidade(3);
		iv3.setSub_total(9);
		
		ItensVenda iv4 = new ItensVenda();
		iv4.setFk_cod_venda(201);
		iv4.setFk_cod_produto(404);
		iv4.setQuantidade(2);
		iv4.setSub_total(8);
		
		ItensVenda iv5 = new ItensVenda();
		iv5.setFk_cod_venda(201);
		iv5.setFk_cod_produto(403);
		iv5.setQuantidade(1);
		iv5.setSub_total(3);
		
		ItensVenda iv6 = new ItensVenda();
		iv6.setFk_cod_venda(203);
		iv6.setFk_cod_produto(405);
		iv6.setQuantidade(2);
		iv6.setSub_total(3);
		
		ItensVenda iv7 = new ItensVenda();
		iv7.setFk_cod_venda(203);
		iv7.setFk_cod_produto(406);
		iv7.setQuantidade(10);
		iv7.setSub_total(1);
		
		ItensVenda iv8 = new ItensVenda();
		iv8.setFk_cod_venda(204);
		iv8.setFk_cod_produto(406);
		iv8.setQuantidade(10);
		iv8.setSub_total(1);
		
		ItensVenda iv9 = new ItensVenda();
		iv9.setFk_cod_venda(204);
		iv9.setFk_cod_produto(400);
		iv9.setQuantidade(5);
		iv9.setSub_total(10);
		
		ItensVenda iv10 = new ItensVenda();
		iv10.setFk_cod_venda(206);
		iv10.setFk_cod_produto(408);
		iv10.setQuantidade(5);
		iv10.setSub_total(10);
		
		ItensVenda iv11 = new ItensVenda();
		iv11.setFk_cod_venda(206);
		iv11.setFk_cod_produto(409);
		iv11.setQuantidade(3);
		iv11.setSub_total(1.50);
		
		ItensVenda iv12 = new ItensVenda();
		iv12.setFk_cod_venda(207);
		iv12.setFk_cod_produto(404);
		iv12.setQuantidade(3);
		iv12.setSub_total(12);
		
		ItensVenda iv13 = new ItensVenda();
		iv13.setFk_cod_venda(207);
		iv13.setFk_cod_produto(405);
		iv13.setQuantidade(3);
		iv13.setSub_total(4.50);
		
		ItensVenda iv14 = new ItensVenda();
		iv14.setFk_cod_venda(209);
		iv14.setFk_cod_produto(406);
		iv14.setQuantidade(20);
		iv14.setSub_total(2);
		
		ItensVenda iv15 = new ItensVenda();
		iv15.setFk_cod_venda(209);
		iv15.setFk_cod_produto(407);
		iv15.setQuantidade(5);
		iv15.setSub_total(10);
		
		ItensVenda iv16 = new ItensVenda();
		iv16.setFk_cod_venda(210);
		iv16.setFk_cod_produto(401);
		iv16.setQuantidade(3);
		iv16.setSub_total(60);
		
		ItensVenda iv17 = new ItensVenda();
		iv17.setFk_cod_venda(210);
		iv17.setFk_cod_produto(402);
		iv17.setQuantidade(2);
		iv17.setSub_total(16);
		
		ItensVenda iv18 = new ItensVenda();
		iv18.setFk_cod_venda(212);
		iv18.setFk_cod_produto(407);
		iv18.setQuantidade(5);
		iv18.setSub_total(10);
		
		ItensVenda iv19 = new ItensVenda();
		iv19.setFk_cod_venda(212);
		iv19.setFk_cod_produto(402);
		iv19.setQuantidade(2);
		iv19.setSub_total(16);
		
		ItensVenda iv20 = new ItensVenda();
		iv20.setFk_cod_venda(213);
		iv20.setFk_cod_produto(400);
		iv20.setQuantidade(4);
		iv20.setSub_total(8);
		
		ItensVenda iv21 = new ItensVenda();
		iv21.setFk_cod_venda(213);
		iv21.setFk_cod_produto(408);
		iv21.setQuantidade(10);
		iv21.setSub_total(20);
		
		ivendaBanco.adicionarItensVenda(iv20);
		ivendaBanco.adicionarItensVenda(iv21);
		
		//ivendaBanco.getItensVenda(300);
		
		//ivendaBanco.removerItensVenda(200);
		
		List<ItensVenda> itvenda = ivendaBanco.getTodosItensVenda();
        
        for (int i = 0; i <= itvenda.size()-1; i++)
        {
        	System.out.println("------");
            System.out.println("ID: " + itvenda.get(i).getFk_cod_venda());
            System.out.println("ID_Produto: " + itvenda.get(i).getFk_cod_produto());
            System.out.println("Quantidade: " + itvenda.get(i).getQuantidade());
            System.out.println("SubTotal: " + itvenda.get(i).getSub_total());
            System.out.println("------");
        } 
		
	}

}

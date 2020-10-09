package principal;

import java.util.List;

import DAO.VendaDAO;
import Date.Conversor;
import conexao.ConexaoBanco;
import model.Produto;
import model.Venda;


public class CriarVenda {

	public static void main(String[] args) {
		VendaDAO vendaBanco = new ConexaoBanco();
		Conversor cd = new Conversor();

		Venda v1 = new Venda();
		v1.setPk_cod_venda(200);
		v1.setFk_cod_cliente(101);
		v1.setData_venda(cd.Data());
		v1.setHora_venda(cd.Hora());
		v1.setTotal(2);
		
		Venda v2 = new Venda();
		v2.setPk_cod_venda(201);
		v2.setFk_cod_cliente(101);
		v2.setData_venda(cd.Data());
		v2.setHora_venda(cd.Hora());
		v2.setTotal(0);
		
		Venda v3 = new Venda();
		v3.setPk_cod_venda(202);
		v3.setFk_cod_cliente(101);
		v3.setData_venda(cd.Data());
		v3.setHora_venda(cd.Hora());
		v3.setTotal(0);
		
		Venda v4 = new Venda();
		v4.setPk_cod_venda(203);
		v4.setFk_cod_cliente(102);
		v4.setData_venda(cd.Data());
		v4.setHora_venda(cd.Hora());
		v4.setTotal(0);
		
		Venda v5 = new Venda();
		v5.setPk_cod_venda(204);
		v5.setFk_cod_cliente(102);
		v5.setData_venda(cd.Data());
		v5.setHora_venda(cd.Hora());
		v5.setTotal(0);
		
		Venda v6 = new Venda();
		v6.setPk_cod_venda(205);
		v6.setFk_cod_cliente(102);
		v6.setData_venda(cd.Data());
		v6.setHora_venda(cd.Hora());
		v6.setTotal(0);
		
		Venda v7 = new Venda();
		v7.setPk_cod_venda(206);
		v7.setFk_cod_cliente(103);
		v7.setData_venda(cd.Data());
		v7.setHora_venda(cd.Hora());
		v7.setTotal(0);
		
		Venda v8 = new Venda();
		v8.setPk_cod_venda(207);
		v8.setFk_cod_cliente(103);
		v8.setData_venda(cd.Data());
		v8.setHora_venda(cd.Hora());
		v8.setTotal(0);
		
		Venda v9 = new Venda();
		v9.setPk_cod_venda(208);
		v9.setFk_cod_cliente(103);
		v9.setData_venda(cd.Data());
		v9.setHora_venda(cd.Hora());
		v9.setTotal(0);
		
		Venda v10 = new Venda();
		v10.setPk_cod_venda(209);
		v10.setFk_cod_cliente(104);
		v10.setData_venda(cd.Data());
		v10.setHora_venda(cd.Hora());
		v10.setTotal(0);
		
		Venda v11 = new Venda();
		v11.setPk_cod_venda(210);
		v11.setFk_cod_cliente(104);
		v11.setData_venda(cd.Data());
		v11.setHora_venda(cd.Hora());
		v11.setTotal(0);
		
		Venda v12 = new Venda();
		v12.setPk_cod_venda(211);
		v12.setFk_cod_cliente(104);
		v12.setData_venda(cd.Data());
		v12.setHora_venda(cd.Hora());
		v12.setTotal(0);

		Venda v13 = new Venda();
		v13.setPk_cod_venda(212);
		v13.setFk_cod_cliente(105);
		v13.setData_venda(cd.Data());
		v13.setHora_venda(cd.Hora());
		v13.setTotal(0);
		
		Venda v14 = new Venda();
		v14.setPk_cod_venda(213);
		v14.setFk_cod_cliente(105);
		v14.setData_venda(cd.Data());
		v14.setHora_venda(cd.Hora());
		v14.setTotal(0);
		
		Venda v15 = new Venda();
		v15.setPk_cod_venda(214);
		v15.setFk_cod_cliente(105);
		v15.setData_venda(cd.Data());
		v15.setHora_venda(cd.Hora());
		v15.setTotal(0);
		

		//vendaBanco.adicionarVenda(v15);
		
		
		//vendaBanco.getVenda(301);
		
		//vendaBanco.removerVenda(301);
		
		List<Venda> venda = vendaBanco.getTodasVendas();
        
        for (int i = 0; i <= venda.size()-1; i++)
        {
        	System.out.println("------");
            System.out.println("ID_Venda: " + venda.get(i).getPk_cod_venda());
            System.out.println("ID_Cliente: " + venda.get(i).getFk_cod_cliente());
            System.out.println("Data Venda: " + venda.get(i).getData_venda());
            System.out.println("Hora Venda: " + venda.get(i).getHora_venda());
            System.out.println("Total: " + venda.get(i).getTotal());
            System.out.println("------");
        } 
		
		
        List<Venda> vendaAno = vendaBanco.getTodasVendas();
        
        for (int i = 0; i <= vendaAno.size()-1; i++)
        {
        	System.out.println("------");
            System.out.println("ID_Venda: " + vendaAno.get(i).getPk_cod_venda());
            System.out.println("ID_Cliente: " + vendaAno.get(i).getFk_cod_cliente());
            System.out.println("------");
        } 
	}

}

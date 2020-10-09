package principal;

import java.util.List;

import DAO.DistribuidorDAO;
import conexao.ConexaoBanco;
import model.Cliente;
import model.Distribuidor;

public class CriarDistribuidor {

	public static void main(String[] args) {
		DistribuidorDAO bancoDist = new ConexaoBanco();
        
        Distribuidor dt1 = new Distribuidor();
        dt1.setPk_cod_dist(500);
        dt1.setNome_fantasia("MERCADINHO DA VILA");
        dt1.setEmail("MERCADO@GMAIL.COM");
        dt1.setTelefone("666.666.666");
        dt1.setRazao_social("S.A IRMÃOS");
        
        Distribuidor dt2 = new Distribuidor();
        dt2.setPk_cod_dist(501);
        dt2.setNome_fantasia("DISTRIBUIDOR DO VALE");
        dt2.setEmail("VALE@GMAIL.COM");
        dt2.setTelefone("777.777.777");
        dt2.setRazao_social("VALE");
        
        
        
        //bancoDist.adicionarDistribuidor(dt2);
        
        //bancoDist.getDistribuidor(500);
        
        //bancoDist.removerDistribuidor(500);
        
        List<Distribuidor> distribuidores = bancoDist.getTodosDistribuidores();
        
        for (int i = 0; i <= distribuidores.size()-1; i++)
        {
        	System.out.println("------");
            System.out.println("ID: " + distribuidores.get(i).getPk_cod_dist());
            System.out.println("Nome: " + distribuidores.get(i).getNome_fantasia());
            System.out.println("Email: " + distribuidores.get(i).getEmail());
            System.out.println("Telefone: " + distribuidores.get(i).getTelefone());
            System.out.println("Razão Social: " + distribuidores.get(i).getRazao_social());
            System.out.println("------");
        } 
       
	}

}

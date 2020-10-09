package principal;

import java.util.List;

import DAO.ClienteDAO;
import conexao.ConexaoBanco;
import model.Cliente;

public class CriarCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setPk_cod_cliente(101);
        c1.setNome("PEDRO HENRIQUE");
        c1.setEmail("PEDRO@GMAIL.COM");
        c1.setTelefone("222.222.222");
        c1.setEndereco("RUA ALVARES 45");
        c1.setData_nasc("1999-09-28");
        
        Cliente c2 = new Cliente();
        c2.setPk_cod_cliente(102);
        c2.setNome("LEONARDO MESSIAS");
        c2.setEmail("LEONARDO@GMAIL.COM");
        c2.setTelefone("333.333.333");
        c2.setEndereco("RUA JOÃO CURSINO 102");
        c2.setData_nasc("1988-11-13");
        
        Cliente c3 = new Cliente();
        c3.setPk_cod_cliente(103);
        c3.setNome("DANILO OLIVEIRA");
        c3.setEmail("DANILO@GMAIL.COM");
        c3.setTelefone("444.444.444");
        c3.setEndereco("AV.CABRAL 960");
        c3.setData_nasc("1995-01-12");
        
        Cliente c4 = new Cliente();
        c4.setPk_cod_cliente(104);
        c4.setNome("LUCAS FRANÇA");
        c4.setEmail("");
        c4.setTelefone("555.555.555");
        c4.setEndereco("RUA ITAMBE");
        c4.setData_nasc("1988-09-28");
        
        Cliente c5 = new Cliente();
        c5.setPk_cod_cliente(105);
        c5.setNome("LUIS HENRIQUE");
        c5.setEmail("");
        c5.setTelefone("111.111.111");
        c5.setEndereco("RUA GULHERME 155");
        c5.setData_nasc("1999-07-10");
        
        
        ClienteDAO bancoCliente = new ConexaoBanco();
        //bancoCliente.adicionarCliente(c5); 
        
        //bancoCliente.getCliente(102);
        
        //bancoCliente.removerCliente(12); 
        
        
        //bancoCliente.GetClienteSemEmail();


        List<Cliente> clientes = bancoCliente.getTodosClientes();
        
        for (int i = 0; i <= clientes.size()-1; i++)
        {
        	System.out.println("------");
            System.out.println("ID: " + clientes.get(i).getPk_cod_cliente());
            System.out.println("Nome: " + clientes.get(i).getNome());
            System.out.println("Email: " + clientes.get(i).getEmail());
            System.out.println("Telefone: " + clientes.get(i).getTelefone());
            System.out.println("Data de Nascimento: " + clientes.get(i).getData_nasc());
            System.out.println("Endereço: " + clientes.get(i).getEndereco());
            System.out.println("------");
        }       
	}

}

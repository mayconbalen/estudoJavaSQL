package agendaeletronica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import agendaeletronica.dominio.Participante;


public class Main {

	public static void  main(String args[]) {
		try { 
			Class.forName("com.mysql.jdbc.Driver");  // Driver para conectar no banco
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendaeletronica", "aplicacao", "maycon224422");
			// endereço da conexao
			
			Statement stmt = con.createStatement(); //crio quem vai executar os comandos
			
			ResultSet rs = stmt.executeQuery("select participante.id, participante.nome from participante");
			/*
			rs.next(); // indo para primeira linha da consulta
			int id =rs.getInt(1); // 1
			String nome = rs.getString(2); // igor
			
			rs.next();// indo para segunda  linha da consulta
			int id2 =rs.getInt(1); // 2
			String nome2 = rs.getString(2); // maycon
			System.out.println("particimante "+nome + nome2);
			*/
			while (rs.next()) {
	
				int id =rs.getInt(1); // 1
				String nome = rs.getString(2); // igor
				
				Participante participante = new Participante();
				participante.setId(id);
				participante.setNome(nome);
				
				
			
			System.out.println("particimante "+nome);
			}
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
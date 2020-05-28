package com.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Aluno;

public class AlunoDAO {

	// insere aluno no banco CRUD - Create, Read, Update, Delete
	public void create(Aluno aluno) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;

		String sql = "insert into aluno(matricula, nome) values (?, ?)";

		try {

			stmt = con.prepareStatement(sql); // instancia uma instrucao sql
			stmt.setString(1, aluno.getMatricula()); // primeiro parametro da query
			stmt.setString(2, aluno.getNome()); // segundo parametro

			stmt.execute();
			System.out.println("Aluno incluido com sucesso...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

	}

	// ler todos os registros da tabela aluno
	public List<Aluno> readAll() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String sql = " select matricula, nome from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();

		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));

				alunos.add(aluno);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao tentar ler tabela aluno");
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}

		return alunos;
	}

	public void update(Aluno aluno) {

		try {
			// create the mysql database connection
			String Driver = "com.mysql.jdbc.Driver";
			String Url = "jdbc:mysql://localhost:3306/aluno";
			Class.forName(Driver);
			Connection conn = DriverManager.getConnection(Url, "root", "");

			// create the mysql delete statement.
			// i'm deleting the row where the id is "3", which corresponds to my
			// "Barney Rubble" record.
			String query = "UPDATE aluno SET nome=? WHERE matricula=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, aluno.getNome());
			preparedStmt.setString(2, aluno.getMatricula());

			// execute the preparedstatement
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}

	public void delete(Aluno aluno) {
		try {
			// create the mysql database connection
			String Driver = "com.mysql.jdbc.Driver";
			String Url = "jdbc:mysql://localhost:3306/aluno";
			Class.forName(Driver);
			Connection conn = DriverManager.getConnection(Url, "root", "");

			// create the mysql delete statement.
			// i'm deleting the row where the id is "3", which corresponds to my
			// "Barney Rubble" record.
			String query = "delete from aluno where matricula = ?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, aluno.getMatricula());

			// execute the preparedstatement
			preparedStmt.execute();

			conn.close();
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
}
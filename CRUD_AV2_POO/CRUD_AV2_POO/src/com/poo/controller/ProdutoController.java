package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.ProdutoDAO;
import com.poo.model.Produto;

public class ProdutoController {


	// regra para incluir um produto

	public void create(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAO();

			dao.create(produto);
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("Erro no Controller");
		} finally {
			// System.out.println("Fim insersão");
		}
	}
	// regra para ler um produto

	public List<Produto> readAll() {
		List<Produto> produto = new ArrayList<Produto>();
		try {
			ProdutoDAO dao = new ProdutoDAO();
			produto = dao.readAll();
		} finally {
		}

		return produto;
	}
	// regra para alterar um produto

	public void update(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAO();

			dao.update(produto);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		} finally {
			System.out.println("Fim alteração");
		}
	}
	// regra para deletar um produto

	public void delete(Produto produto) {
		try {
			ProdutoDAO dao = new ProdutoDAO();

			dao.delete(produto);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro no Controller");
		} finally {
			System.out.println("Fim Exclução");
		}
	}

}

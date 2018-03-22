package br.com.eduardo.jpalearning.teste;

import br.com.eduardo.jpalearning.dao.Dao;
import br.com.eduardo.jpalearning.modelo.Aluno;

public class TestaDao {

	public static void main(String[] args) {
		
		Dao dao = new Dao();
		
		Aluno aluno = new Aluno();
		aluno.setNome("El Principiant");
		
		dao.insere(aluno);
		dao.fecha();

	}

}

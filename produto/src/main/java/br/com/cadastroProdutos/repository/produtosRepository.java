package br.com.cadastroProdutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cadastroProdutos.model.produto;

public interface produtosRepository extends JpaRepository<produto, Long> {

}
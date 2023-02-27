package br.com.cadastroProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastroProdutos.model.produto;
import br.com.cadastroProdutos.repository.produtosRepository;

@Service
public class produtosService {

	@Autowired
	private produtosRepository ProdutosRepository;

	public produto save(produto Produtos) {
		return ProdutosRepository.save(Produtos);
	}

	public Optional<produto> getById(Long id) {
		return ProdutosRepository.findById(id);
	}

	public void deletarProdutos(Long id) {
		ProdutosRepository.deleteById(id);
	}

	public List<produto> listarTodos() {
		return ProdutosRepository.findAll();
	}

}

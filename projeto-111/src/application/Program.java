package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import entities.Entidade;
import entities.Produto;
import entities.ProdutoDTO;

public class Program {
	public static void main (String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(10L, "Teclado Mecânico", 150.0));
		produtos.add(new Produto(3L, "Monitor", 600.0));
		produtos.add(new Produto(25L, "Memória Ram", 400.0));
		produtos.add(new Produto(7L, "Mouse", 100.0));
		produtos.add(new Produto(30L, "SSD", 250.0));
		
		List<Object> objetos = new ArrayList<>();
		
		Predicate<Entidade> validarEntidade = e -> e.getId() >= 10;
		
		Function<Produto, ProdutoDTO> converterProduto = p -> new ProdutoDTO(p.getId(), p.getNome(), p.getPreco());
		
		executarEtl(produtos, validarEntidade, converterProduto, objetos);
		
		objetos.forEach(System.out::println);
	}
	
	public static <T, R> void executarEtl (
			List<? extends T> dados,
			Predicate<? super T> filtro,
			Function<? super T, ? extends R> conversor,
			List<? super R> novosDados
			) {
		
		dados.stream()
			.filter(filtro)
			.map(conversor)
			.forEach(novosDados::add);
		
	}
}

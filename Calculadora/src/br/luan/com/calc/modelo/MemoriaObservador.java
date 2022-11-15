package br.luan.com.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);

}

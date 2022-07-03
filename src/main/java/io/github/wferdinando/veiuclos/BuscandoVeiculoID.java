package io.github.wferdinando.veiuclos;

import javax.persistence.EntityManager;

import io.github.wferdinando.veiuclos.dominio.Veiculo;
import io.github.wferdinando.veiuclos.util.JPAUtil;

public class BuscandoVeiculoID {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("Veículo de código: " + veiculo.getCodigo()
		+ " é um " + veiculo.getModelo());
		
		manager.close();
		JPAUtil.close();

	}

}

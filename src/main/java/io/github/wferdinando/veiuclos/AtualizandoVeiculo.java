package io.github.wferdinando.veiuclos;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import io.github.wferdinando.veiuclos.dominio.Veiculo;
import io.github.wferdinando.veiuclos.util.JPAUtil;

public class AtualizandoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("Valor atual: R$ " + veiculo.getValor());
		veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
		System.out.println("Novo Valor: R$ " + veiculo.getValor());
		
		tx.commit();
		manager.close();
		JPAUtil.close();
	}

}

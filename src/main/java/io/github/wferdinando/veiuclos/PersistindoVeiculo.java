package io.github.wferdinando.veiuclos;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import io.github.wferdinando.veiuclos.dominio.Veiculo;
import io.github.wferdinando.veiuclos.util.JPAUtil;

public class PersistindoVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setFabricante("Honda");
		veiculo1.setModelo("Civic");
		veiculo1.setAnoFabricacao(2012);
		veiculo1.setAnoModelo(2013);
		veiculo1.setValor(new BigDecimal(71300));
		
		manager.persist(veiculo1);
		
		tx.commit();
		manager.close();
		JPAUtil.close();

	}

}

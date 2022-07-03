package io.github.wferdinando.veiuclos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import io.github.wferdinando.veiuclos.dominio.Veiculo;
import io.github.wferdinando.veiuclos.util.JPAUtil;

public class ListandoTodosVeiculos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();

		Query query = manager.createQuery("from Veiculo");
		List<Veiculo> veiculos = query.getResultList();

		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getCodigo() + " - " + veiculo.getFabricante() + " " + veiculo.getModelo()
					+ ", ano " + veiculo.getAnoFabricacao() + "/" + veiculo.getAnoModelo() + " por " + "R$ "
					+ veiculo.getValor());
		}

		manager.close();
		JPAUtil.close();
	}

}

package br.com.webapi.mvc.NatWill.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.webapi.mvc.NatWill.model.Pedido;
import br.com.webapi.mvc.NatWill.model.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	List<Pedido> findByStatus(StatusPedido status);
	
	
}

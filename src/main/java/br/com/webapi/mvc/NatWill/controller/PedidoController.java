package br.com.webapi.mvc.NatWill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.webapi.mvc.NatWill.dto.ReqNovoPedido;
import br.com.webapi.mvc.NatWill.model.Pedido;
import br.com.webapi.mvc.NatWill.repository.PedidoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String formulario(ReqNovoPedido req) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid ReqNovoPedido req, BindingResult result) {
		
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = req.toPedido();
		pedidoRepository.save(pedido);
		
		return "redirect:/home";
	}
	
	
	
	
}

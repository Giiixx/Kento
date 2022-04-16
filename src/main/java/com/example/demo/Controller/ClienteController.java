package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Entity.Cliente;
import com.example.demo.Model.Service.IClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente",cliente);
		model.addAttribute("listaClientes",clienteService.getAllClientes());
		return "cliente/index";
	}
	
	@RequestMapping( value="/form",method=RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clienteService.guardar(cliente);
		return"redirect:/cliente/";
	}
	
	@RequestMapping("eliminar/{id}")
	public String eliminar (@PathVariable(value="id")Long id) {
		clienteService.eliminarCliente(id);
		return "redirect:/cliente/";
	}
			
			
			
			
			
			
			
			
			
	
}

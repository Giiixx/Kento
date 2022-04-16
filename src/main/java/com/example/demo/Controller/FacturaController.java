package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Entity.Factura;
import com.example.demo.Model.Service.IClienteService;
import com.example.demo.Model.Service.IFacturaService;

@Controller
@RequestMapping("/factura")
public class FacturaController {
	
	@Autowired
	private IClienteService clienteService;
	
	
	@Autowired 
	private IFacturaService facturaService;
	
	
	@RequestMapping("/")
	public String inicio (Model model) {
		Factura factura = new Factura();
		model.addAttribute("factura",factura);
		model.addAttribute("listaClientes",clienteService.getAllClientes());
		model.addAttribute("listafacturas",facturaService.listarFacturas());
		return "factura/index";
	}
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(Factura factura) {
		facturaService.guardarFactura(factura);
		return "redirect:/factura/";
	}

	@RequestMapping("eliminar/{id}")
	public String eliminar (@PathVariable(value="id")Long id) {
		facturaService.eliminarFactura(id);
		return "redirect:/factura/";
	}
	
}

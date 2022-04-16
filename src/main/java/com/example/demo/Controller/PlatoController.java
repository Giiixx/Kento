package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Entity.Plato;
import com.example.demo.Model.Service.ICategoriaService;
import com.example.demo.Model.Service.IPlatoService;

@Controller
@RequestMapping("/plato")
public class PlatoController {
	
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IPlatoService platoService;
	
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Plato plato = new Plato();
		model.addAttribute("plato", plato);
		model.addAttribute("listaCategorias",categoriaService.getAllCategoria());
		model.addAttribute("listaPlatos",platoService.listarPlatos());
		return "plato/index";
		
	}
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(Plato plato) {
		platoService.guardarPlato(plato);
		return "redirect:/plato/";
		
	}
	
	@RequestMapping("eliminar/{id}")
	public String eliminar(@PathVariable (value = "id")  Long id) {
		platoService.eliminarPlato(id);
		return "redirect:/plato/";
	}

}

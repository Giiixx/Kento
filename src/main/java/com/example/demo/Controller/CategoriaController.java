package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Model.Entity.Categoria;
import com.example.demo.Model.Service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService categoriaService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria",categoria);
		model.addAttribute("listaCategorias",categoriaService.getAllCategoria());
		return "categoria/index";	
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guardar(Categoria categoria) {
		categoriaService.guardar(categoria);
		return"redirect:/categoria/";
	
	}
	
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id")Long id) {
		categoriaService.eliminarCategoria(id);
		return "redirect:/categoria/";
	
	}
	
	
	
}

package com.example.demo.Model.Service;

import java.util.List;

import com.example.demo.Model.Entity.Plato;


public interface IPlatoService {

	public void guardarPlato(Plato plato);
	public List<Plato>listarPlatos();
	public void eliminarPlato(Long id);
	
}

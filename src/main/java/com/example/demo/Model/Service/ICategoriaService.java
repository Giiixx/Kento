package com.example.demo.Model.Service;

import java.util.List;

import com.example.demo.Model.Entity.Categoria;

public interface ICategoriaService {

	public void guardar(Categoria categoria);
	public  List<Categoria>getAllCategoria();
	public void eliminarCategoria(Long id);



	

}

package com.example.demo.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.DAO.ICategoriaDAO;
import com.example.demo.Model.Entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private ICategoriaDAO categoriaDAO;
	
	@Override
	public void guardar(Categoria categoria) {
		categoriaDAO.save(categoria);
	}

	@Override
	public List<Categoria> getAllCategoria() {
		// TODO Auto-generated method stub
		return (List<Categoria>)categoriaDAO.findAll();
	}

	@Override
	public void eliminarCategoria(Long id) {
		// TODO Auto-generated method stub
		categoriaDAO.deleteById(id);
	}

}

package com.example.demo.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.DAO.IPlatoDAO;
import com.example.demo.Model.Entity.Plato;

@Service
public class PlatoServiceImpl implements IPlatoService {
	
	@Autowired
	private IPlatoDAO platoDAO;
	

	@Override
	public void guardarPlato(Plato plato) {
		// TODO Auto-generated method stub
		platoDAO.save(plato);
		
	}

	@Override
	public List<Plato> listarPlatos() {
		// TODO Auto-generated method stub
		return platoDAO.findAllByOrderByNombreAsc();
	}

	@Override
	public void eliminarPlato(Long id) {
		// TODO Auto-generated method stub
		platoDAO.deleteById(id);
	}
	
	

}

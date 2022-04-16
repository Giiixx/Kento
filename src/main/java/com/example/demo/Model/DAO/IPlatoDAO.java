package com.example.demo.Model.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Entity.Plato;

public interface IPlatoDAO extends CrudRepository<Plato, Long> {

	public List<Plato>findAllByOrderByNombreAsc();
	
}

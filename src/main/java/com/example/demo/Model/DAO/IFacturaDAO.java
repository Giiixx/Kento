package com.example.demo.Model.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Entity.Factura;

public interface IFacturaDAO extends CrudRepository<Factura, Long>{

	public List<Factura>findAllByOrderByFechaAsc();
	
}

package com.example.demo.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.DAO.IFacturaDAO;
import com.example.demo.Model.Entity.Factura;


@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaDAO facturaDAO;
	
	
	@Override
	public void guardarFactura(Factura factura) {
		// TODO Auto-generated method stub
		facturaDAO.save(factura);
		
	}

	@Override
	public List<Factura> listarFacturas() {
		// TODO Auto-generated method stub
		return facturaDAO.findAllByOrderByFechaAsc();
	}

	@Override
	public void eliminarFactura(Long id) {
		facturaDAO.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}

package com.example.demo.Model.Service;

import java.util.List;

import com.example.demo.Model.Entity.Factura;

public interface IFacturaService {


	public void guardarFactura(Factura factura);
	public List<Factura>listarFacturas();
	public void eliminarFactura(Long id);

}

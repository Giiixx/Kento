package com.example.demo.Model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.DAO.IClienteDAO;
import com.example.demo.Model.Entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDAO clienteDAO;
	
	@Override
	public void guardar(Cliente cliente) {
		clienteDAO.save(cliente);
	}
	
	@Override
	public List<Cliente>getAllClientes(){
		return (List<Cliente>)clienteDAO.findAll();
	}
	
	@Override
	public void eliminarCliente(Long id) {
		clienteDAO.deleteById(id);
	}

}

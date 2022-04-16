package com.example.demo.Model.Service;

import java.util.List;

import com.example.demo.Model.Entity.Cliente;

public interface IClienteService {

	public void guardar(Cliente cliente);

	public List<Cliente> getAllClientes();

	public void eliminarCliente(Long id);

	
}

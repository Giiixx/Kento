package com.example.demo.Model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente,Long> {

}

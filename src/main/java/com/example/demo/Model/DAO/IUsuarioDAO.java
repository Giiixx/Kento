package com.example.demo.Model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}

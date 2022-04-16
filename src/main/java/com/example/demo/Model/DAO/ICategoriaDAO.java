package com.example.demo.Model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Entity.Categoria;

public interface ICategoriaDAO  extends CrudRepository<Categoria,Long>{

}

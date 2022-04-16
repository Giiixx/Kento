package com.example.demo.Model.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.DAO.IUsuarioDAO;
import com.example.demo.Model.Entity.Rol;
import com.example.demo.Model.Entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService {
	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDAO.findByUsername(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("usuario no existe");
		}
		
		List<GrantedAuthority> listaRoles = new ArrayList<GrantedAuthority>();
		for(Rol rol: usuario.getRoles()) {
			listaRoles.add(new SimpleGrantedAuthority(rol.getAuthority()));
		}
		
		if(listaRoles.isEmpty()) {
			throw new UsernameNotFoundException("El usuario no tiene roles asignados");	
		}
		
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, listaRoles);
	}
}

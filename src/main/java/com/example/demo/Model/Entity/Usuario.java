package com.example.demo.Model.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private Boolean enabled;
	
	@OneToMany
	@JoinColumn(name = "user_id")
	private List<Rol> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	/*INSERT INTO usuarios VALUES('Administrador','$2a$10$XzeFGfr4JXvjdWV6yNMXAOcYS5HPsIoubWjffoaIjmxYM1YNOwQ8u',1);
INSERT INTO usuarios VALUES('Jorge','$2a$10$PmZyOCXiXG/jGFh/D6xmc.KzGdLShGB3TaRyDBgFZ0ssrwKTEhox2',1);

SELECT * FROM usuarios;
SELECT * FROM roles;

INSERT INTO roles Values(1,'ROLE_ADMIN');
INSERT INTO roles Values(1,'ROLE_USER');
INSERT INTO roles Values(2,'ROLE_USER');
*/
	/*asdsasdsadsa*/
}

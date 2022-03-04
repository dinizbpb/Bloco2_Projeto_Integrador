package org.generation.maisUnidas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")

public class Usuario {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Size(min = 1, max = 255)
private String nome_completo;

@NotBlank
@Size(min = 1, max = 350)
private String usuario_email;

@NotBlank
@Size(min = 8, max = 255)
private String senha;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome_completo() {
	return nome_completo;
}

public void setNome_completo(String nome_completo) {
	this.nome_completo = nome_completo;
}

public String getUsuario_email() {
	return usuario_email;
}

public void setUsuario_email(String usuario_email) {
	this.usuario_email = usuario_email;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}





}

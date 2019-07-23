package com.ms.project.portafolio.app.usuarios.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.project.portafolio.app.usuarios.commons.models.entity.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository repo;

	@GetMapping(value = "/usuario")
	public List<Usuario> obtener() {
		return (List<Usuario>) repo.findAll();
	}

}

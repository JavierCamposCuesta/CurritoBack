package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class AnuncioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void crearUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}

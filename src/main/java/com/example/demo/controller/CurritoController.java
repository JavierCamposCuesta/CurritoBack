package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.AnuncioService;

@RestController
public class CurritoController {
	
	@Autowired
	private AnuncioService usuarioService;
	
	@PostMapping("/usuario")
	public ResponseEntity<?>crearUsuario(@RequestBody Usuario usuario){
		
		

			
			usuarioService.crearUsuario(usuario);
			return ResponseEntity.noContent().build();	}
	
	
	

}

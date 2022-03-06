package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Usuario {
	
	@Id
	private String email;
	private String nombre;
	private String apellidos;
	private String telefono;
	private LocalDate fechaNacimiento;
	private String ubicacion;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Anuncio>listaFavoritos = new ArrayList<Anuncio>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Anuncio>listaOfertados = new ArrayList<Anuncio>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Anuncio>listaDemandados = new ArrayList<Anuncio>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Comentario>comentariosPendientes = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<Comentario>listaComentarios = new ArrayList<>();
	
	
//	private List<Chat>listaChats = new ArrayList<Chat>();
	private String fotoPerfil;
	
	public Usuario() {
		
	}

	public Usuario(String email, String nombre, String apellidos, String telefono, LocalDate fechaNacimiento) {
		super();
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Usuario(String email, String nombre, String apellidos) {
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Anuncio> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<Anuncio> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}

	public List<Anuncio> getListaOfertados() {
		return listaOfertados;
	}

	public void setListaOfertados(List<Anuncio> listaOfertados) {
		this.listaOfertados = listaOfertados;
	}

	public List<Anuncio> getListaDemandados() {
		return listaDemandados;
	}

	public void setListaDemandados(List<Anuncio> listaDemandados) {
		this.listaDemandados = listaDemandados;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}
	
	
	
	

}

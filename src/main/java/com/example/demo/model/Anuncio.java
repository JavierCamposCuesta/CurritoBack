package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Anuncio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private double precio;
	private String descripcion;
	
//	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval = true)
//	private List<String>listaImagenes = new ArrayList<>();
	
	@ManyToOne
	@JsonBackReference
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval = true)
	@JsonBackReference
	private List<Usuario>listaSolicitantes = new ArrayList<>();
	
	private boolean finalizado = false;
	private LocalDate fechaAnuncio;
	private LocalDate fechaFin;
	private TipoPrecio tipoPrecio;
	
	public Anuncio() {
		
	}

	public Anuncio(String titulo, double precio, String descripcion, Categoria categoria,
			LocalDate fechaAnuncio, TipoPrecio tipoPrecio) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.fechaAnuncio = fechaAnuncio;
		this.tipoPrecio = tipoPrecio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public List<String> getListaImagenes() {
//		return listaImagenes;
//	}
//
//	public void setListaImagenes(List<String> listaImagenes) {
//		this.listaImagenes = listaImagenes;
//	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Usuario> getListaSolicitantes() {
		return listaSolicitantes;
	}

	public void setListaSolicitantes(List<Usuario> listaSolicitantes) {
		this.listaSolicitantes = listaSolicitantes;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public LocalDate getFechaAnuncio() {
		return fechaAnuncio;
	}

	public void setFechaAnuncio(LocalDate fechaAnuncio) {
		this.fechaAnuncio = fechaAnuncio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public TipoPrecio getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(TipoPrecio tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}
	
	
	
	

}

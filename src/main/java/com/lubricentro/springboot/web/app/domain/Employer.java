package com.lubricentro.springboot.web.app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private int code;
	private String dni;
	private String nombres;
	private String apellidos;
	public Employer(int code, String dni, String nombres, String apellidos) {
		super();
		this.code = code;
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	public Employer(String dni, String nombres, String apellidos) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	public Employer() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}

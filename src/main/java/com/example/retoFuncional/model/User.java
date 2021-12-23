package com.example.retoFuncional.model;

public class User {
	private String nombre;
	private String userName;
	private String password;
	
	public User(String nombre, String userName, String password) {
		super();
		this.nombre = nombre;
		this.userName = userName;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", userName=" + userName + ", password=" + password + "]";
	}
	
}

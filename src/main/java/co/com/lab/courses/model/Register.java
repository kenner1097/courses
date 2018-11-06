package co.com.lab.courses.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "register")
@Access(AccessType.FIELD)
public class Register extends ParentEntity {

	/**
	 * Id because is using Serialization
	 */
	private static final long serialVersionUID = -8514688022212492980L;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "password")
	private String password;

	@Column(name = "role_user")
	private String role_user;

	@Column(name = "email")
	private String email;

	/**
	 * Get and Setters
	 */

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole_user() {
		return role_user;
	}

	public void setRole_user(String role_user) {
		this.role_user = role_user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Constructors
	 */

	public Register() {

	}

	public Register(String nombre, String apellidos, String password, String role_user, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;
		this.role_user = role_user;
		this.email = email;
	}
}
package co.com.lab.courses.service;

import java.util.List;

import co.com.lab.courses.model.Register;

public interface RegisterService {
	
	/*
	 * Guarda un usuario
	 * @param register
	 * @return el registro guardado
	 */
	Register save(Register register);
	
	/*
	 * Recupera la lista de usuarios
	 * @return
	 */
	List<Register> findAll();
	
	/*
	 * Elimina un usuario con el id
	 * @param id 
	 */
	void deleteRegister(Long long1);
	
}
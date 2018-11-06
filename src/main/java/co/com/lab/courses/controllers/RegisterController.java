package co.com.lab.courses.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.lab.courses.model.Register;
import co.com.lab.courses.service.RegisterService;
import co.com.lab.courses.util.RestResponse;

@RestController
public class RegisterController {
	@Autowired
	protected RegisterService registerService;

	//Objeto mapeador
	protected ObjectMapper mapper;
	
	/*
	 * Guardar y modificar
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String registerJson) throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		Register register = this.mapper.readValue(registerJson, Register.class);
		
		if (!this.validate(register)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los campos obligaotrios no estan diligenciados");
		}
		
		this.registerService.save(register);
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/deleteRegister", method=RequestMethod.POST)
	public RestResponse deleteRegister(@RequestBody String registerJson) throws Exception {
		
		this.mapper = new ObjectMapper();
		
		Register register = this.mapper.readValue(registerJson, Register.class);
		Long Reg = register.getId();
		if (Reg == null) {
			throw new Exception("El id está nulo");
		}
		
		this.registerService.deleteRegister(register.getId());
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value="/getRegister", method=RequestMethod.GET)
	public List<Register> getRegister() {
		return this.registerService.findAll();
	}  
	
	 /*
	 * Validacion de los campos
	 */
	private boolean validate(Register register) {
		boolean isValid = true;
		
		if (register.getNombre() == null) {
			isValid = false;
		}
		
		if (register.getApellidos() == null) {
			isValid = false;
		}
		
		if (register.getPassword() == null) {
			isValid = false;
		}
		
		if (register.getRole_user() == null) {
			isValid = false;
		}
		
		if (register.getEmail() == null) {
			isValid=false;
		}
			
		return isValid;
	}
}
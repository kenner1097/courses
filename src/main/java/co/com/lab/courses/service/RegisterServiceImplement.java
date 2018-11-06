package co.com.lab.courses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.lab.courses.dao.RegisterRepository;
import co.com.lab.courses.model.Register;

@Service
public class RegisterServiceImplement implements RegisterService{

	/*
	 * Se usan metodos que hacen parte de RegisterRepository
	 * 
	 */
	@Autowired
	protected RegisterRepository registerRepository;

	@Override
	public Register save(Register register) {
		return this.registerRepository.save(register);
	}

	@Override
	public List<Register> findAll() {
		return this.registerRepository.findAll();
	}

	@Override
	public void deleteRegister(Long id) {
		this.registerRepository.delete((long) id);
		
	}
	
 }
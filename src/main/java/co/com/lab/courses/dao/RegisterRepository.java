package co.com.lab.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.lab.courses.model.Register;

public interface RegisterRepository extends JpaRepository <Register, Long> {

	@SuppressWarnings("unchecked")
	Register save(Register register);

}
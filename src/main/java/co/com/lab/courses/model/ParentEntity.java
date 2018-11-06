package co.com.lab.courses.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // clase donde llegaran todas las entidades
@Access(AccessType.FIELD) // aceso de tipo de campo
public class ParentEntity implements Serializable {

	/**
	 * Id because is using Serialization
	 */
	private static final long serialVersionUID = 6924939265972727152L;

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

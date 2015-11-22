package org.galvan.hibernate.airlines.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Pilot class.
 * 
 * @authorIván Galván Erburu
 * @email ivan_galvan@cuatrovientos.org
 */
@Entity
public class Pilot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer license;
	
	@OneToOne
	private Aircraft aircraft;

	/**
	 * 
	 */
	public Pilot() {
		super();
	}

	/**
	 * @param name
	 * @param license
	 */
	public Pilot(String name, Integer license) {
		super();
		this.name = name;
		this.license = license;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the license
	 */
	public Integer getLicense() {
		return license;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(Integer license) {
		this.license = license;
	}

	/**
	 * @return the aircraft
	 */
	public Aircraft getAircraft() {
		return aircraft;
	}

	/**
	 * @param aircraft the aircraft to set
	 */
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pilot [id=" + id + ", name=" + name + ", license=" + license + ", aircraft=" + aircraft + "]";
	}
}

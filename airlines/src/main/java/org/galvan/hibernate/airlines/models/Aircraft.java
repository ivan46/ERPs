package org.galvan.hibernate.airlines.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.galvan.hibernate.airlines.models.Pilot;

/**
 * Aircraft class.
 * 
 * @author Iván Galván Erburu
 * @email ivan_galvan@cuatrovientos.org
 */
@Entity
public class Aircraft {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private Float autonomy;
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Pilot pilot;
	/*
	@OneToOne(mappedBy="aircraft", cascade = CascadeType.ALL)
	private Pilot pilot;
	*/
		
	
	public Aircraft() {
		super();
	}
	
	/**
	 * @param model
	 * @param autonomy
	 */
	public Aircraft(String model, Float autonomy) {
		super();
		this.model = model;
		this.autonomy = autonomy;
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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the autonomy
	 */
	public Float getAutonomy() {
		return autonomy;
	}
	/**
	 * @param autonomy the autonomy to set
	 */
	public void setAutonomy(Float autonomy) {
		this.autonomy = autonomy;
	}
	/**
	 * @return the pilot
	 */
	public Pilot getPilot() {
		return pilot;
	}
	
	
	/**
	 * @param pilot the pilot to set
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aircraft [id=" + id + ", model=" + model + ", autonomy=" + autonomy + ", pilot=" + pilot + "]";
	}
	
}

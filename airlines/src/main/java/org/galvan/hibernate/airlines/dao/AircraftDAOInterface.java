package org.galvan.hibernate.airlines.dao;

import java.util.List;

import org.galvan.hibernate.airlines.models.Aircraft;

/**
 * interface for AircraftDAO class
 * @author Iván Galván 
 * @email ivan_galvan@cuatrovientos.org
 */
public interface AircraftDAOInterface {
	
	public Aircraft selectById(Long id);
	public List<Aircraft> selectAll ();
	public void insert (Aircraft aircraft);
	public void update (Aircraft aircraft);
	public void delete (Aircraft aircraft);

}

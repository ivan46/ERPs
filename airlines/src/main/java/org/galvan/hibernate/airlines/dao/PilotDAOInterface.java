package org.galvan.hibernate.airlines.dao;

import java.util.List;

import org.galvan.hibernate.airlines.models.Pilot;

/**
 * interface for PilotDAO class
 * @author Iván Galván
 * @email ivan_galvan@cuatrovientos.org
 */
public interface PilotDAOInterface {
	
	public Pilot selectById(Long id);
	public List<Pilot> selectAll ();
	public void insert (Pilot pilot);
	public void update (Pilot pilot);
	public void delete (Pilot pilot);

}

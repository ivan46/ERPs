package org.galvan.hibernate.airlines;

import org.galvan.hibernate.airlines.dao.PilotDAO;
import org.galvan.hibernate.airlines.models.Aircraft;
import org.galvan.hibernate.airlines.models.Pilot;

import antlr.collections.List;
import org.galvan.hibernate.airlines.dao.AircraftDAO;
/*
 * The main class
 */
public class App 
{
    
    public static void main( String[] args )
    {
    	//Crear dos instancias de Aircraft
    	Aircraft aircraft = new Aircraft("modeloA", 12f);
        Aircraft aircraftTwo = new Aircraft("modeloB", 15f);
        
        //Crear dos instancias de Pilot
        Pilot pilot = new Pilot("pilotoOne", 1);
        Pilot pilotTwo = new Pilot();
        pilotTwo.setName("pilotoTwo");
        pilotTwo.setLicense(2);
        
                       
        //Asociar las instancias de aircraft al Pilot 
        aircraft.setPilot(pilot);
        aircraftTwo.setPilot(pilotTwo);          
        
        //Guardar los aircraft en la BD mediante el DAO
        AircraftDAO aircraftDAO = new AircraftDAO();
        
        aircraftDAO.insert(aircraft);
        aircraftDAO.insert(aircraftTwo);
        
        //Mostrar por consola la consulta de todos los aircraft
        System.out.println(aircraftDAO.selectAll());
                
        /*     
        //Mostrar los datos del aircraft con id=1     
        System.out.println(aircraftDAO.selectById(1l).toString());
        //Mostrar el nombre del piloto cuyo aircraft tiene id=2
        System.out.println("Name of the pilot two: "+ aircraftDAO.selectById(2l).getPilot().getName());
        */
       
                     
    }
}

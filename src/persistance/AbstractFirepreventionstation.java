package persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractFirepreventionstation entity provides the base persistence definition
 * of the Firepreventionstation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFirepreventionstation implements
		java.io.Serializable {

	// Fields

	private Integer idfirepreventionstation;
	private String stationname;
	private String location;
	private Set places = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractFirepreventionstation() {
	}

	/** minimal constructor */
	public AbstractFirepreventionstation(Integer idfirepreventionstation) {
		this.idfirepreventionstation = idfirepreventionstation;
	}

	/** full constructor */
	public AbstractFirepreventionstation(Integer idfirepreventionstation,
			String stationname, String location, Set places) {
		this.idfirepreventionstation = idfirepreventionstation;
		this.stationname = stationname;
		this.location = location;
		this.places = places;
	}

	// Property accessors

	public Integer getIdfirepreventionstation() {
		return this.idfirepreventionstation;
	}

	public void setIdfirepreventionstation(Integer idfirepreventionstation) {
		this.idfirepreventionstation = idfirepreventionstation;
	}

	public String getStationname() {
		return this.stationname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set getPlaces() {
		return this.places;
	}

	public void setPlaces(Set places) {
		this.places = places;
	}

}
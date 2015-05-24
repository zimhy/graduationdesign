package persistance;

import java.util.Set;

/**
 * Firepreventionstation entity. @author MyEclipse Persistence Tools
 */
public class Firepreventionstation extends AbstractFirepreventionstation
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Firepreventionstation() {
	}

	/** minimal constructor */
	public Firepreventionstation(Integer idfirepreventionstation) {
		super(idfirepreventionstation);
	}

	/** full constructor */
	public Firepreventionstation(Integer idfirepreventionstation,
			String stationname, String location, Set places) {
		super(idfirepreventionstation, stationname, location, places);
	}

}

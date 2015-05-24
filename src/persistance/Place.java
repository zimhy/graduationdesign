package persistance;

import java.util.Set;

/**
 * Place entity. @author MyEclipse Persistence Tools
 */
public class Place extends AbstractPlace implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Place() {
	}

	/** minimal constructor */
	public Place(Integer idplace, Firepreventionstation firepreventionstation) {
		super(idplace, firepreventionstation);
	}

	/** full constructor */
	public Place(Integer idplace, Firepreventionstation firepreventionstation,
			String placename, String address, String postcode, String area,
			String email, String legalRepresentative, String responsiblePerson,
			String telResponsiblePerson, String idResponsiblePerson,
			String parttimeManager, String telParttimeManger,
			String idParttimeManager, String manager, String telManager,
			String idManager, String establishdate, String mainproperty,
			String deputyproperty, String ownership, Set planses) {
		super(idplace, firepreventionstation, placename, address, postcode,
				area, email, legalRepresentative, responsiblePerson,
				telResponsiblePerson, idResponsiblePerson, parttimeManager,
				telParttimeManger, idParttimeManager, manager, telManager,
				idManager, establishdate, mainproperty, deputyproperty,
				ownership, planses);
	}

}

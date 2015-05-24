package persistance;

import java.util.Set;

/**
 * Firetrunk entity. @author MyEclipse Persistence Tools
 */
public class Firetrunk extends AbstractFiretrunk implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Firetrunk() {
	}

	/** minimal constructor */
	public Firetrunk(Integer idfiretrunk) {
		super(idfiretrunk);
	}

	/** full constructor */
	public Firetrunk(Integer idfiretrunk, String licenseTag, String tunktype,
			String trunklevel, String trunkfunction, Set plansHasFiretrunks) {
		super(idfiretrunk, licenseTag, tunktype, trunklevel, trunkfunction,
				plansHasFiretrunks);
	}

}

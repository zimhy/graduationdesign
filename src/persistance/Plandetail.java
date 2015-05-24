package persistance;

import java.util.Set;

/**
 * Plandetail entity. @author MyEclipse Persistence Tools
 */
public class Plandetail extends AbstractPlandetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Plandetail() {
	}

	/** minimal constructor */
	public Plandetail(Integer idplandetail) {
		super(idplandetail);
	}

	/** full constructor */
	public Plandetail(Integer idplandetail, String forcedeploymentimagepath,
			String forcedeploymentdescription, Set planses, Set operations) {
		super(idplandetail, forcedeploymentimagepath,
				forcedeploymentdescription, planses, operations);
	}

}

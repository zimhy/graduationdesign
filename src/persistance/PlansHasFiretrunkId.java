package persistance;

/**
 * PlansHasFiretrunkId entity. @author MyEclipse Persistence Tools
 */
public class PlansHasFiretrunkId extends AbstractPlansHasFiretrunkId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PlansHasFiretrunkId() {
	}

	/** full constructor */
	public PlansHasFiretrunkId(Plans plans, Firetrunk firetrunk) {
		super(plans, firetrunk);
	}

}

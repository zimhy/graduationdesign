package persistance;

/**
 * AbstractPlansHasFiretrunk entity provides the base persistence definition of
 * the PlansHasFiretrunk entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlansHasFiretrunk implements java.io.Serializable {

	// Fields

	private PlansHasFiretrunkId id;

	// Constructors

	/** default constructor */
	public AbstractPlansHasFiretrunk() {
	}

	/** full constructor */
	public AbstractPlansHasFiretrunk(PlansHasFiretrunkId id) {
		this.id = id;
	}

	// Property accessors

	public PlansHasFiretrunkId getId() {
		return this.id;
	}

	public void setId(PlansHasFiretrunkId id) {
		this.id = id;
	}

}
package persistance;

/**
 * AbstractPlansHasFiretrunkId entity provides the base persistence definition
 * of the PlansHasFiretrunkId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlansHasFiretrunkId implements
		java.io.Serializable {

	// Fields

	private Plans plans;
	private Firetrunk firetrunk;

	// Constructors

	/** default constructor */
	public AbstractPlansHasFiretrunkId() {
	}

	/** full constructor */
	public AbstractPlansHasFiretrunkId(Plans plans, Firetrunk firetrunk) {
		this.plans = plans;
		this.firetrunk = firetrunk;
	}

	// Property accessors

	public Plans getPlans() {
		return this.plans;
	}

	public void setPlans(Plans plans) {
		this.plans = plans;
	}

	public Firetrunk getFiretrunk() {
		return this.firetrunk;
	}

	public void setFiretrunk(Firetrunk firetrunk) {
		this.firetrunk = firetrunk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPlansHasFiretrunkId))
			return false;
		AbstractPlansHasFiretrunkId castOther = (AbstractPlansHasFiretrunkId) other;

		return ((this.getPlans() == castOther.getPlans()) || (this.getPlans() != null
				&& castOther.getPlans() != null && this.getPlans().equals(
				castOther.getPlans())))
				&& ((this.getFiretrunk() == castOther.getFiretrunk()) || (this
						.getFiretrunk() != null
						&& castOther.getFiretrunk() != null && this
						.getFiretrunk().equals(castOther.getFiretrunk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPlans() == null ? 0 : this.getPlans().hashCode());
		result = 37 * result
				+ (getFiretrunk() == null ? 0 : this.getFiretrunk().hashCode());
		return result;
	}

}
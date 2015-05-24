package persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPlandetail entity provides the base persistence definition of the
 * Plandetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlandetail implements java.io.Serializable {

	// Fields

	private Integer idplandetail;
	private String forcedeploymentimagepath;
	private String forcedeploymentdescription;
	private Set planses = new HashSet(0);
	private Set operations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPlandetail() {
	}

	/** minimal constructor */
	public AbstractPlandetail(Integer idplandetail) {
		this.idplandetail = idplandetail;
	}

	/** full constructor */
	public AbstractPlandetail(Integer idplandetail,
			String forcedeploymentimagepath, String forcedeploymentdescription,
			Set planses, Set operations) {
		this.idplandetail = idplandetail;
		this.forcedeploymentimagepath = forcedeploymentimagepath;
		this.forcedeploymentdescription = forcedeploymentdescription;
		this.planses = planses;
		this.operations = operations;
	}

	// Property accessors

	public Integer getIdplandetail() {
		return this.idplandetail;
	}

	public void setIdplandetail(Integer idplandetail) {
		this.idplandetail = idplandetail;
	}

	public String getForcedeploymentimagepath() {
		return this.forcedeploymentimagepath;
	}

	public void setForcedeploymentimagepath(String forcedeploymentimagepath) {
		this.forcedeploymentimagepath = forcedeploymentimagepath;
	}

	public String getForcedeploymentdescription() {
		return this.forcedeploymentdescription;
	}

	public void setForcedeploymentdescription(String forcedeploymentdescription) {
		this.forcedeploymentdescription = forcedeploymentdescription;
	}

	public Set getPlanses() {
		return this.planses;
	}

	public void setPlanses(Set planses) {
		this.planses = planses;
	}

	public Set getOperations() {
		return this.operations;
	}

	public void setOperations(Set operations) {
		this.operations = operations;
	}

}
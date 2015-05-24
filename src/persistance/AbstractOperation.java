package persistance;

/**
 * AbstractOperation entity provides the base persistence definition of the
 * Operation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOperation implements java.io.Serializable {

	// Fields

	private Integer idoperation;
	private Plandetail plandetail;
	private String detachment;
	private Integer unitnumber;
	private String forcestructure;
	private String actiondescription;

	// Constructors

	/** default constructor */
	public AbstractOperation() {
	}

	/** minimal constructor */
	public AbstractOperation(Integer idoperation, Plandetail plandetail) {
		this.idoperation = idoperation;
		this.plandetail = plandetail;
	}

	/** full constructor */
	public AbstractOperation(Integer idoperation, Plandetail plandetail,
			String detachment, Integer unitnumber, String forcestructure,
			String actiondescription) {
		this.idoperation = idoperation;
		this.plandetail = plandetail;
		this.detachment = detachment;
		this.unitnumber = unitnumber;
		this.forcestructure = forcestructure;
		this.actiondescription = actiondescription;
	}

	// Property accessors

	public Integer getIdoperation() {
		return this.idoperation;
	}

	public void setIdoperation(Integer idoperation) {
		this.idoperation = idoperation;
	}

	public Plandetail getPlandetail() {
		return this.plandetail;
	}

	public void setPlandetail(Plandetail plandetail) {
		this.plandetail = plandetail;
	}

	public String getDetachment() {
		return this.detachment;
	}

	public void setDetachment(String detachment) {
		this.detachment = detachment;
	}

	public Integer getUnitnumber() {
		return this.unitnumber;
	}

	public void setUnitnumber(Integer unitnumber) {
		this.unitnumber = unitnumber;
	}

	public String getForcestructure() {
		return this.forcestructure;
	}

	public void setForcestructure(String forcestructure) {
		this.forcestructure = forcestructure;
	}

	public String getActiondescription() {
		return this.actiondescription;
	}

	public void setActiondescription(String actiondescription) {
		this.actiondescription = actiondescription;
	}

}
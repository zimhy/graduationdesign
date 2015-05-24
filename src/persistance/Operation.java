package persistance;

/**
 * Operation entity. @author MyEclipse Persistence Tools
 */
public class Operation extends AbstractOperation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Operation() {
	}

	/** minimal constructor */
	public Operation(Integer idoperation, Plandetail plandetail) {
		super(idoperation, plandetail);
	}

	/** full constructor */
	public Operation(Integer idoperation, Plandetail plandetail,
			String detachment, Integer unitnumber, String forcestructure,
			String actiondescription) {
		super(idoperation, plandetail, detachment, unitnumber, forcestructure,
				actiondescription);
	}

}

package persistance;

import java.util.Date;
import java.util.Set;

/**
 * Plans entity. @author MyEclipse Persistence Tools
 */
public class Plans extends AbstractPlans implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Plans() {
	}

	/** minimal constructor */
	public Plans(Integer idplans, Place place, Firehazard firehazard,
			Plandetail plandetail) {
		super(idplans, place, firehazard, plandetail);
	}

	/** full constructor */
	public Plans(Integer idplans, Place place, Firehazard firehazard,
			Plandetail plandetail, String planname, String plantype,
			Date plandate, String imagepath, String designdepartment,
			String designer, Set plansHasFiretrunks) {
		super(idplans, place, firehazard, plandetail, planname, plantype,
				plandate, imagepath, designdepartment, designer,
				plansHasFiretrunks);
	}

}

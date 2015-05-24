package persistance;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPlans entity provides the base persistence definition of the Plans
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlans implements java.io.Serializable {

	// Fields

	private Integer idplans;
	private Place place;
	private Firehazard firehazard;
	private Plandetail plandetail;
	private String planname;
	private String plantype;
	private Date plandate;
	private String imagepath;
	private String designdepartment;
	private String designer;
	private Set plansHasFiretrunks = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPlans() {
	}

	/** minimal constructor */
	public AbstractPlans(Integer idplans, Place place, Firehazard firehazard,
			Plandetail plandetail) {
		this.idplans = idplans;
		this.place = place;
		this.firehazard = firehazard;
		this.plandetail = plandetail;
	}

	/** full constructor */
	public AbstractPlans(Integer idplans, Place place, Firehazard firehazard,
			Plandetail plandetail, String planname, String plantype,
			Date plandate, String imagepath, String designdepartment,
			String designer, Set plansHasFiretrunks) {
		this.idplans = idplans;
		this.place = place;
		this.firehazard = firehazard;
		this.plandetail = plandetail;
		this.planname = planname;
		this.plantype = plantype;
		this.plandate = plandate;
		this.imagepath = imagepath;
		this.designdepartment = designdepartment;
		this.designer = designer;
		this.plansHasFiretrunks = plansHasFiretrunks;
	}

	// Property accessors

	public Integer getIdplans() {
		return this.idplans;
	}

	public void setIdplans(Integer idplans) {
		this.idplans = idplans;
	}

	public Place getPlace() {
		return this.place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Firehazard getFirehazard() {
		return this.firehazard;
	}

	public void setFirehazard(Firehazard firehazard) {
		this.firehazard = firehazard;
	}

	public Plandetail getPlandetail() {
		return this.plandetail;
	}

	public void setPlandetail(Plandetail plandetail) {
		this.plandetail = plandetail;
	}

	public String getPlanname() {
		return this.planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getPlantype() {
		return this.plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	public Date getPlandate() {
		return this.plandate;
	}

	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}

	public String getImagepath() {
		return this.imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getDesigndepartment() {
		return this.designdepartment;
	}

	public void setDesigndepartment(String designdepartment) {
		this.designdepartment = designdepartment;
	}

	public String getDesigner() {
		return this.designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public Set getPlansHasFiretrunks() {
		return this.plansHasFiretrunks;
	}

	public void setPlansHasFiretrunks(Set plansHasFiretrunks) {
		this.plansHasFiretrunks = plansHasFiretrunks;
	}

}
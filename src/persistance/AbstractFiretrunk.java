package persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractFiretrunk entity provides the base persistence definition of the
 * Firetrunk entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFiretrunk implements java.io.Serializable {

	// Fields

	private Integer idfiretrunk;
	private String licenseTag;
	private String tunktype;
	private String trunklevel;
	private String trunkfunction;
	private Set plansHasFiretrunks = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractFiretrunk() {
	}

	/** minimal constructor */
	public AbstractFiretrunk(Integer idfiretrunk) {
		this.idfiretrunk = idfiretrunk;
	}

	/** full constructor */
	public AbstractFiretrunk(Integer idfiretrunk, String licenseTag,
			String tunktype, String trunklevel, String trunkfunction,
			Set plansHasFiretrunks) {
		this.idfiretrunk = idfiretrunk;
		this.licenseTag = licenseTag;
		this.tunktype = tunktype;
		this.trunklevel = trunklevel;
		this.trunkfunction = trunkfunction;
		this.plansHasFiretrunks = plansHasFiretrunks;
	}

	// Property accessors

	public Integer getIdfiretrunk() {
		return this.idfiretrunk;
	}

	public void setIdfiretrunk(Integer idfiretrunk) {
		this.idfiretrunk = idfiretrunk;
	}

	public String getLicenseTag() {
		return this.licenseTag;
	}

	public void setLicenseTag(String licenseTag) {
		this.licenseTag = licenseTag;
	}

	public String getTunktype() {
		return this.tunktype;
	}

	public void setTunktype(String tunktype) {
		this.tunktype = tunktype;
	}

	public String getTrunklevel() {
		return this.trunklevel;
	}

	public void setTrunklevel(String trunklevel) {
		this.trunklevel = trunklevel;
	}

	public String getTrunkfunction() {
		return this.trunkfunction;
	}

	public void setTrunkfunction(String trunkfunction) {
		this.trunkfunction = trunkfunction;
	}

	public Set getPlansHasFiretrunks() {
		return this.plansHasFiretrunks;
	}

	public void setPlansHasFiretrunks(Set plansHasFiretrunks) {
		this.plansHasFiretrunks = plansHasFiretrunks;
	}

}
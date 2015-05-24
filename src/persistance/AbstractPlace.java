package persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPlace entity provides the base persistence definition of the Place
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPlace implements java.io.Serializable {

	// Fields

	private Integer idplace;
	private Firepreventionstation firepreventionstation;
	private String placename;
	private String address;
	private String postcode;
	private String area;
	private String email;
	private String legalRepresentative;
	private String responsiblePerson;
	private String telResponsiblePerson;
	private String idResponsiblePerson;
	private String parttimeManager;
	private String telParttimeManger;
	private String idParttimeManager;
	private String manager;
	private String telManager;
	private String idManager;
	private String establishdate;
	private String mainproperty;
	private String deputyproperty;
	private String ownership;
	private Set planses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPlace() {
	}

	/** minimal constructor */
	public AbstractPlace(Integer idplace,
			Firepreventionstation firepreventionstation) {
		this.idplace = idplace;
		this.firepreventionstation = firepreventionstation;
	}

	/** full constructor */
	public AbstractPlace(Integer idplace,
			Firepreventionstation firepreventionstation, String placename,
			String address, String postcode, String area, String email,
			String legalRepresentative, String responsiblePerson,
			String telResponsiblePerson, String idResponsiblePerson,
			String parttimeManager, String telParttimeManger,
			String idParttimeManager, String manager, String telManager,
			String idManager, String establishdate, String mainproperty,
			String deputyproperty, String ownership, Set planses) {
		this.idplace = idplace;
		this.firepreventionstation = firepreventionstation;
		this.placename = placename;
		this.address = address;
		this.postcode = postcode;
		this.area = area;
		this.email = email;
		this.legalRepresentative = legalRepresentative;
		this.responsiblePerson = responsiblePerson;
		this.telResponsiblePerson = telResponsiblePerson;
		this.idResponsiblePerson = idResponsiblePerson;
		this.parttimeManager = parttimeManager;
		this.telParttimeManger = telParttimeManger;
		this.idParttimeManager = idParttimeManager;
		this.manager = manager;
		this.telManager = telManager;
		this.idManager = idManager;
		this.establishdate = establishdate;
		this.mainproperty = mainproperty;
		this.deputyproperty = deputyproperty;
		this.ownership = ownership;
		this.planses = planses;
	}

	// Property accessors

	public Integer getIdplace() {
		return this.idplace;
	}

	public void setIdplace(Integer idplace) {
		this.idplace = idplace;
	}

	public Firepreventionstation getFirepreventionstation() {
		return this.firepreventionstation;
	}

	public void setFirepreventionstation(
			Firepreventionstation firepreventionstation) {
		this.firepreventionstation = firepreventionstation;
	}

	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getResponsiblePerson() {
		return this.responsiblePerson;
	}

	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public String getTelResponsiblePerson() {
		return this.telResponsiblePerson;
	}

	public void setTelResponsiblePerson(String telResponsiblePerson) {
		this.telResponsiblePerson = telResponsiblePerson;
	}

	public String getIdResponsiblePerson() {
		return this.idResponsiblePerson;
	}

	public void setIdResponsiblePerson(String idResponsiblePerson) {
		this.idResponsiblePerson = idResponsiblePerson;
	}

	public String getParttimeManager() {
		return this.parttimeManager;
	}

	public void setParttimeManager(String parttimeManager) {
		this.parttimeManager = parttimeManager;
	}

	public String getTelParttimeManger() {
		return this.telParttimeManger;
	}

	public void setTelParttimeManger(String telParttimeManger) {
		this.telParttimeManger = telParttimeManger;
	}

	public String getIdParttimeManager() {
		return this.idParttimeManager;
	}

	public void setIdParttimeManager(String idParttimeManager) {
		this.idParttimeManager = idParttimeManager;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getTelManager() {
		return this.telManager;
	}

	public void setTelManager(String telManager) {
		this.telManager = telManager;
	}

	public String getIdManager() {
		return this.idManager;
	}

	public void setIdManager(String idManager) {
		this.idManager = idManager;
	}

	public String getEstablishdate() {
		return this.establishdate;
	}

	public void setEstablishdate(String establishdate) {
		this.establishdate = establishdate;
	}

	public String getMainproperty() {
		return this.mainproperty;
	}

	public void setMainproperty(String mainproperty) {
		this.mainproperty = mainproperty;
	}

	public String getDeputyproperty() {
		return this.deputyproperty;
	}

	public void setDeputyproperty(String deputyproperty) {
		this.deputyproperty = deputyproperty;
	}

	public String getOwnership() {
		return this.ownership;
	}

	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	public Set getPlanses() {
		return this.planses;
	}

	public void setPlanses(Set planses) {
		this.planses = planses;
	}

}
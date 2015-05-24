package persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractFirehazard entity provides the base persistence definition of the
 * Firehazard entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFirehazard implements java.io.Serializable {

	// Fields

	private Integer idfirehazard;
	private String fireplace;
	private String dimention;
	private String burningsubstance;
	private String buildingpropertie;
	private String damagerate;
	private String fireresistancerate;
	private String buildinglength;
	private String firebreaklength;
	private String burningproportion;
	private String burningvolume;
	private String firehazardtype;
	private String property;
	private Set planses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractFirehazard() {
	}

	/** minimal constructor */
	public AbstractFirehazard(Integer idfirehazard) {
		this.idfirehazard = idfirehazard;
	}

	/** full constructor */
	public AbstractFirehazard(Integer idfirehazard, String fireplace,
			String dimention, String burningsubstance,
			String buildingpropertie, String damagerate,
			String fireresistancerate, String buildinglength,
			String firebreaklength, String burningproportion,
			String burningvolume, String firehazardtype, String property,
			Set planses) {
		this.idfirehazard = idfirehazard;
		this.fireplace = fireplace;
		this.dimention = dimention;
		this.burningsubstance = burningsubstance;
		this.buildingpropertie = buildingpropertie;
		this.damagerate = damagerate;
		this.fireresistancerate = fireresistancerate;
		this.buildinglength = buildinglength;
		this.firebreaklength = firebreaklength;
		this.burningproportion = burningproportion;
		this.burningvolume = burningvolume;
		this.firehazardtype = firehazardtype;
		this.property = property;
		this.planses = planses;
	}

	// Property accessors

	public Integer getIdfirehazard() {
		return this.idfirehazard;
	}

	public void setIdfirehazard(Integer idfirehazard) {
		this.idfirehazard = idfirehazard;
	}

	public String getFireplace() {
		return this.fireplace;
	}

	public void setFireplace(String fireplace) {
		this.fireplace = fireplace;
	}

	public String getDimention() {
		return this.dimention;
	}

	public void setDimention(String dimention) {
		this.dimention = dimention;
	}

	public String getBurningsubstance() {
		return this.burningsubstance;
	}

	public void setBurningsubstance(String burningsubstance) {
		this.burningsubstance = burningsubstance;
	}

	public String getBuildingpropertie() {
		return this.buildingpropertie;
	}

	public void setBuildingpropertie(String buildingpropertie) {
		this.buildingpropertie = buildingpropertie;
	}

	public String getDamagerate() {
		return this.damagerate;
	}

	public void setDamagerate(String damagerate) {
		this.damagerate = damagerate;
	}

	public String getFireresistancerate() {
		return this.fireresistancerate;
	}

	public void setFireresistancerate(String fireresistancerate) {
		this.fireresistancerate = fireresistancerate;
	}

	public String getBuildinglength() {
		return this.buildinglength;
	}

	public void setBuildinglength(String buildinglength) {
		this.buildinglength = buildinglength;
	}

	public String getFirebreaklength() {
		return this.firebreaklength;
	}

	public void setFirebreaklength(String firebreaklength) {
		this.firebreaklength = firebreaklength;
	}

	public String getBurningproportion() {
		return this.burningproportion;
	}

	public void setBurningproportion(String burningproportion) {
		this.burningproportion = burningproportion;
	}

	public String getBurningvolume() {
		return this.burningvolume;
	}

	public void setBurningvolume(String burningvolume) {
		this.burningvolume = burningvolume;
	}

	public String getFirehazardtype() {
		return this.firehazardtype;
	}

	public void setFirehazardtype(String firehazardtype) {
		this.firehazardtype = firehazardtype;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Set getPlanses() {
		return this.planses;
	}

	public void setPlanses(Set planses) {
		this.planses = planses;
	}

}
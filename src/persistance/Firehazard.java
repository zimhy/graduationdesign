package persistance;

import java.util.Set;

/**
 * Firehazard entity. @author MyEclipse Persistence Tools
 */
public class Firehazard extends AbstractFirehazard implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Firehazard() {
	}

	/** minimal constructor */
	public Firehazard(Integer idfirehazard) {
		super(idfirehazard);
	}

	/** full constructor */
	public Firehazard(Integer idfirehazard, String fireplace, String dimention,
			String burningsubstance, String buildingpropertie,
			String damagerate, String fireresistancerate,
			String buildinglength, String firebreaklength,
			String burningproportion, String burningvolume,
			String firehazardtype, String property, Set planses) {
		super(idfirehazard, fireplace, dimention, burningsubstance,
				buildingpropertie, damagerate, fireresistancerate,
				buildinglength, firebreaklength, burningproportion,
				burningvolume, firehazardtype, property, planses);
	}

}

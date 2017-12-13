package xml.jaxb.nested;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Foster-Home")
public class FosterHome {

	private String orphanage;
	private String location;
	private List<Family> families;
	private List<String> remainingChildList;

	/**
	 * @return the orphanage
	 */
	public String getOrphanage() {
		return orphanage;
	}

	/**
	 * @param orphanage
	 *            the orphanage to set
	 */
	@XmlElement(name = "Orphanage")
	public void setOrphanage(String orphanage) {
		this.orphanage = orphanage;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	@XmlElement(name = "Location")
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the families
	 */
	public List<Family> getFamilies() {
		return families;
	}

	/**
	 * @param families
	 *            the families to set
	 */
	@XmlElementWrapper(name = "Families")
	@XmlElement(name = "Family")
	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	/**
	 * @return the remainingChildList
	 */
	public List<String> getRemainingChildList() {
		return remainingChildList;
	}

	/**
	 * @param remainingChildList
	 *            the remainingChildList to set
	 */
	@XmlElementWrapper(name = "RemainingChildList")
	@XmlElement(name = "Childid")
	public void setRemainingChildList(List<String> remainingChildList) {
		this.remainingChildList = remainingChildList;
	}

}

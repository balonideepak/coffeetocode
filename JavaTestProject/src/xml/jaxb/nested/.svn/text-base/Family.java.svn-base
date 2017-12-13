package xml.jaxb.nested;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Family {

	private String parentId;
	List<String> childid;

	/**
	 * @return the parentId
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @param parentId
	 *            the parentId to set
	 */
	@XmlElement(name = "Parentid")
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the childid
	 */
	public List<String> getChildid() {
		return childid;
	}

	/**
	 * @param childid
	 *            the childid to set
	 */
	@XmlElementWrapper(name = "Childlist")
	@XmlElement(name = "Childid")
	public void setChildid(List<String> childid) {
		this.childid = childid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Family [parentId=" + parentId + ", childid=" + childid + "]";
	}

}

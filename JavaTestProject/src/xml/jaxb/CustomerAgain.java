package xml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
class CustomerAgain {

	private int age;
	private String name;
	private int social_security_number;

	
	
	public CustomerAgain() {
		super();
	}

	public CustomerAgain(int age, String name, int social_security_number) {
		super();
		this.age = age;
		this.name = name;
		this.social_security_number = social_security_number;
	}

	public int getAge() {
		return age;
	}

	@XmlAttribute
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getSocial_security_number() {
		return social_security_number;
	}

	@XmlTransient
	public void setSocial_security_number(int social_security_number) {
		this.social_security_number = social_security_number;
	}

}

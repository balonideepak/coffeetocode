import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class TestFile {

	/**
	 * @param args
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) throws URISyntaxException {

		String ORAMDS="oramds:/";
		String baseLocation = "oramds:/soa/shared/workflow/";
		String location = "/w/WorkFlowTask.xsd";
		//String location = "oramds:/a/b/c/WorkFlowTask.xsd";case2 input
		

		URI baseURI = new URI(baseLocation);
		URI locationURI = new URI(location);
		URI relativeURI = baseURI.relativize(locationURI);
		String relativeURIstr = relativeURI.toString();
		//System.out.println("relativeURIstr ="+relativeURIstr);
		//case 1 . Oramds refers anoher oramds  
		//case 2 .	Oramds refers relative one 
		//case 3 . Oramds refers http one 
		
		if(location.startsWith(ORAMDS)){
			location="/"+location.substring(location.indexOf(ORAMDS)+ORAMDS.length(),location.length());
		}
		else{
			baseLocation=baseLocation.substring(baseLocation.indexOf(ORAMDS)+ORAMDS.length(),baseLocation.length());
			location="/"+baseLocation+location;
		}
		
		location=location.replaceAll("//", "/");
		//System.out.println(location);
		
		
		String baseLocation1="http://slc08aom.us.oracle.com:8001/soa-infra/services/default/ExternalServiceWithoutFault!1.0/";
		String location1="http://slc08aom.us.oracle.com:8001/soa-infra/services/default/ExternalServiceWithoutFault!1.0/Schemas/a.xsd";
		URI baseURI1= new URI(baseLocation1);
		URI locationURI1 = new URI(location1);
		URI relativeURI1 = baseURI1.relativize(locationURI1);
		//System.out.println(relativeURI1.toString());
		
		String path = "/var/data/stuff/xyz.dat";
		String base = "/var/data";
		String relative = new File(base).toURI().relativize(new File(path).toURI()).getPath();
		//System.out.println(relative);
		
		URI relativeURI2=new URI("http://slc08aom.us.oracle.com:8001/soa-infra/services/default/HTTPBinding!1.0/WSDLs/myhttpService.wsdl");
		String relativeURIToStr=relativeURI2.toString();
		relativeURIToStr=relativeURIToStr.substring(relativeURIToStr.lastIndexOf("/"), relativeURIToStr.length());
		System.out.println(relativeURIToStr);
	
	}

}

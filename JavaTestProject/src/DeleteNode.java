import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;


public class DeleteNode {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {

	File file = new File("/a/b/c/d.xsd");
	System.out.println(file.getName());
	
	
	URI uri1=new URI("oramds:/apps/FusionOrderDemoShared/services/");
	URI uri2=new URI("oramds:/apps/FusionOrderDemoShared/services/oracle/fodemo/storefront/store/service/common/serviceinterface/a.xsd");
		System.out.println(uri1.relativize(uri2));
	}

}

package wsdl;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;

public class Test {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {
   Test obj = new Test();
obj.callMe("hello");
   
//   String relativePath="../../../a/b/c";
//   String DOUBLE_DOT_PREFIX_PATTERN="../";
//   while(relativePath.startsWith(DOUBLE_DOT_PREFIX_PATTERN)){
//	   relativePath=relativePath.substring(relativePath.indexOf(DOUBLE_DOT_PREFIX_PATTERN)+DOUBLE_DOT_PREFIX_PATTERN.length(), relativePath.length());
//   }
//   System.out.println(relativePath);
   String composite="LockheedCorporation";
   String relativePath ="../Schemas/LockheedCorporationBPELProcess.xsd";
   relativePath=relativePath.substring(relativePath.indexOf(composite)+composite.length(),relativePath.length());
   System.out.println(relativePath);
   
   String ORAMDSResourcePath = obj.buildORAMDSPath("oramds:/apps/FusionOrderDemoShared/services/orderbooking/","../../../oracle/fodemo/storefront/store/service/common/serviceinterface/StoreFrontService.wsdl");
   System.out.println(ORAMDSResourcePath);
   
   
   URI uri1=new URI("oramds:/apps/FusionOrderDemoShared/services/orderbooking/a.xsd");
   URI uri2=new URI("oramds:/apps/FusionOrderDemoShared/services/a/b/c/d.xsd");
   URI relativize = uri1.relativize(uri2);
   System.out.println(relativize);
   
   String parentLoc="/a/b/c";
   File relativePathParent = new File(parentLoc);
   StringBuilder relativePath1=new StringBuilder();
   while(parentLoc.contains("/")) {
		relativePath1.append("../");
		parentLoc=parentLoc.substring(0, parentLoc.lastIndexOf("/"));
	}
   System.out.println(relativePath1);
	}
	
	
	void callMe(String param){
	String format = MessageFormat.format("Alpha {0} ", new String[]{null});
	System.out.println(format);
		
		System.out.println("callme called ");
	}
	
	void callMe(String param , Object args){
		System.out.println("callme called  with args");
	}

	private String buildORAMDSPath(String parentURI, String location) {
		String l_location=location;
		String DOUBLE_DOT_PREFIX_PATTERN="../";
		
		if(l_location.startsWith(DOUBLE_DOT_PREFIX_PATTERN)) {
		
		if(parentURI.lastIndexOf("/")==parentURI.length()-1){
			parentURI= parentURI.substring(0, parentURI.lastIndexOf("/"));
		}
		while(l_location.startsWith(DOUBLE_DOT_PREFIX_PATTERN)){
			parentURI= parentURI.substring(0, parentURI.lastIndexOf("/"));
			l_location=l_location.substring(l_location.indexOf(DOUBLE_DOT_PREFIX_PATTERN)+DOUBLE_DOT_PREFIX_PATTERN.length(), l_location.length());
		}
		}
		String result = parentURI+l_location;
		result=result.replaceAll("/"+"/", "/");
		return result;
	}
	
	
}

package wsdl;


import java.io.ByteArrayOutputStream;

import javax.wsdl.Definition;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLWriter;

public class WSDLDefinition  {
	
	
	Definition definition;

	public byte[] getArtifactDetail() {
		try
		{
			WSDLWriter writer = WSDLFactory.newInstance().newWSDLWriter();
			ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
			writer.writeWSDL(definition,byteStream);
			return byteStream.toByteArray();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

}

package test;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sourceforge.wurfl.core.Device;
import net.sourceforge.wurfl.core.WURFLHolder;
import net.sourceforge.wurfl.core.WURFLManager;
public class TestWURFL extends HttpServlet{

	 private WURFLHolder wurflHolder = null;
	  private WURFLManager wurfl = null;
	  private Device device = null;
	  private String r_UA=null;
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	processRequest(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		processRequest(req,resp);
		}
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response){
		wurflHolder = (WURFLHolder) getServletContext().getAttribute(WURFLHolder.class.getName());
		r_UA = request.getHeader("UA");
	    if (this.wurflHolder == null)
	      System.out.println("WURFLHolder is null");
	    this.wurfl = this.wurflHolder.getWURFLManager();
	    if (this.wurfl == null)
	    	System.out.println("WURFLManager is null");
	    this.device = this.wurfl.getDeviceForRequest(r_UA);
	    if (this.device == null)
	    	System.out.println("Device is null");
	}
	
	
	  public ArrayList<String> getAllSupportedPolytoneFormats() {
		    ArrayList<String> supportedFormatsList = new ArrayList<String>();
		    if (this.device.getCapability("ringtone_mmf").equalsIgnoreCase("true")) supportedFormatsList.add("mmf");
		    if (this.device.getCapability("ringtone_midi_polyphonic").equalsIgnoreCase("true")) {
		      int iVoices = 0;
		      try {
		        iVoices = Integer.parseInt(this.device.getCapability("ringtone_voices"));
		      } catch (Exception e1) {
		        e1.printStackTrace();
		      }
		      if ((4 == iVoices) || (8 == iVoices) || (16 == iVoices) || (24 == iVoices) || (32 == iVoices)) {
		        supportedFormatsList.add("mid" + iVoices);
		      }
		    }
		    if (this.device.getCapability("ringtone_spmidi").equalsIgnoreCase("true")) supportedFormatsList.add("spmidi");
		    if ((supportedFormatsList == null) || (supportedFormatsList.isEmpty()))
		      System.out.println("No polytone formats supported");
		    return supportedFormatsList;
		  }
	  
	  public ArrayList<String> getAllSupportedTruetoneFormats() {
		    ArrayList<String> supportedFormatsList = new ArrayList<String>();

		    if (this.device.getCapability("ringtone_awb").equalsIgnoreCase("true")) supportedFormatsList.add("awb");
		    if (this.device.getCapability("ringtone_amr").equalsIgnoreCase("true")) supportedFormatsList.add("amr");
		    if ((supportedFormatsList == null) || (supportedFormatsList.isEmpty()))
		      System.out.println("No truetone formats supported");
		    return supportedFormatsList;
		  }
	
}

/**
 * 
 */
package webrelated;

/**
 * @author deepak.baloni
 * 
 */

public class WurflDemo {
}
//
// public static void main(String arg[]){
//
// try {
// getCapabilities("Mozilla");
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
// }
//
// /**
// * Load capabilities of a given device
// * @param ua User Agent of the device
// * @return JSON object with device's capabilities or null if device not found
// * @throws IOException if connection error occurs
// */
// public static JSONObject getCapabilities(String ua) throws IOException{
// URL wurfl = new
// URL("http://obll2351e2876:7001/aslan/aslan/control/SongDetails.jsp?sid=F8390E4A2C8F478B9DA885FC0949DA5A&txid=28131F79E9F74B80A513CFE4BF8148A5"
// +
// URLEncoder.encode(ua, "UTF-8"));
// URLConnection conn = wurfl.openConnection();
// InputStream is = conn.getInputStream();
// byte [] data = new byte[2048];
// int read = 0;
// ByteArrayOutputStream baos = new ByteArrayOutputStream();
// while ((read = is.read(data)) > 0){
// baos.write(data, 0, read);
// }
// JSONTokener tok = new JSONTokener(baos.toString());
// JSONObject obj = null;
// try {
// obj = (JSONObject) tok.nextValue();
// } catch (JSONException e) {
// e.printStackTrace();
// }
// return obj;
// }
// }
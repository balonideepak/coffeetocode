import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrintActivated {
	public static void main(String[] args) throws Exception {
		String sCurrentLine;
		int count=0;
		int total=0;
		File file =new File("D:/result_listint.txt");
		BufferedReader br =new BufferedReader(new FileReader(file));

		while ((sCurrentLine = br.readLine()) != null) {
			if(sCurrentLine.contains(" Orchestration ACTIVATED")){
			//System.out.println(sCurrentLine);
			//System.out.println(sCurrentLine.split(" Orchestration ACTIVATED")[0]);
			count++;
			}
			total++;
		}
		
		System.out.println(count);
		System.out.println(total);
		
	}

}

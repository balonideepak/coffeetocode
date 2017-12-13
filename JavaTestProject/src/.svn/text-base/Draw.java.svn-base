import java.util.Scanner;

public class Draw {
	
	static char[][] drawingArr=null;
	
	public static void main(String[] args) {
		System.out.println("Give Input");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		while (!"Q".equals(input)) {
			String[] inputArr = input.split(" ");
			
			if(inputArr.length==1){
				System.out.println("No coordinates defined for the input type "+input+" .  Exiting the program ");
				break;
			}
			
			if (input.contains("C")) {
				String width = inputArr[1], height = inputArr[2];
				drawCanvas(width, height);
			}
			else if (input.contains("L")) {
				String x1 = inputArr[1], y1 = inputArr[2], x2 = inputArr[3], y2 = inputArr[4];
				drawLine(x1, y1, x2, y2);
			}
			else if ("R".equalsIgnoreCase(input)) {
				String x1 = inputArr[1], y1 = inputArr[2], x2 = inputArr[3], y2 = inputArr[4];
				drawRectangle(x1, y1, x2, y2);
			}
			
			
			
		}
		in.close();
		System.out.println("Program Ended....");

	}

	private static void drawCanvas(String width, String height) {
		int l_width=Integer.parseInt(width)+1;
		int l_height=Integer.parseInt(height)+1;
		drawingArr=new char[l_width][l_height];
		int w=0;
		int h=0;
		for(int i=0 ; i< 4 ;i++){
			if(i%2==0){
			for(int j=0;j<l_width;j++){
			drawingArr[w++][h]='-';
			System.out.print(drawingArr[w]);
			}
			
			}
			else{
				for(int j=0;j<l_width;j++){
					drawingArr[w][w++]='-';
					System.out.print(drawingArr[w]);
					}	
			}
		}
	}

	private static void drawRectangle(String x1, String y1, String x2, String y2) {

	}

	private static void drawLine(String x1, String y1, String x2, String y2) {

	}
}

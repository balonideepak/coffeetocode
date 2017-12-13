package puzzles;

public class CalculateWaterProblem2 {
	//private static int[] inputArr = { 1, 0, 0, 0, 0, 0, 1,2,0,0,0,0,2};
	//private static int[] inputArr = {0,1,0,2,1,0,1};
	private static int[] inputArr ={0,1,0,2,1,0,1,3,2,1,2,1};

	public static void main(String[] args) {
		calculateWater();
	}

	private static void calculateWater() {
		int startpoint = -1;
		int endpoint = -1;
		boolean resetstartpoint = true;
		int totalwater = 0;
		for (int i = 0; i < inputArr.length; i++) {
			int input = inputArr[i];
			if (resetstartpoint) {
				startpoint = i;
				resetstartpoint = false;
			}

			if (input >= inputArr[startpoint] && startpoint!=i || inputArr.length-1==i) {
				System.out.println("Entering..........");
				endpoint = i;
				int startpointvalue = inputArr[startpoint];
				int endpointvalue = inputArr[endpoint];

				System.out.println("startpointvalue ="+startpointvalue);
				System.out.println("endpointvalue ="+endpointvalue);

				System.out.println("startpoint ="+startpoint);
				System.out.println("endpoint ="+endpoint);

				resetstartpoint = false;
				int diff=startpointvalue >=endpointvalue?endpointvalue:startpointvalue;

				int totalblocks = endpoint - startpoint-1;
				//System.out.println("totalblocks="+totalblocks);
				//System.out.println("diff="+diff);
				totalwater =totalwater+ totalblocks * diff;
				startpoint=endpoint;
			}
		}

		System.out.println("totalwater="+totalwater);

	}
}

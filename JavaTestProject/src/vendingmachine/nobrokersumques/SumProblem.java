package vendingmachine.nobrokersumques;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumProblem {
	public static void main(String[] args) {
		List<Integer> inputList = new LinkedList<>();

		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		for (int i = 0; i < arrSize; i++) {
			inputList.add(in.nextInt());
		}
		int sum = in.nextInt();
		Collections.sort(inputList);

		findPairs(inputList, arrSize, sum);

	}

	private static void findPairs(List<Integer> inputList, int arrSize,
			int sum) {
		int num = arrSize - 1;
		for (int i = 0; i < num - 1; i++) {
			int leftIndex = i + 1;
			int rightIndex = num;
			while (leftIndex < rightIndex) {
				if (inputList.get(i) + inputList.get(leftIndex)
						+ inputList.get(rightIndex) == sum) {
					System.out.println("Sum =" + sum + " , triplets are ("
							+ inputList.get(i) + " , "
							+ inputList.get(leftIndex) + " , "
							+ inputList.get(rightIndex) + " )");
					leftIndex++;
					rightIndex--;

				} else if (inputList.get(i) + inputList.get(leftIndex)
						+ inputList.get(rightIndex) > sum)
					rightIndex--;

				else
					leftIndex++;
			}
		}
	}
}

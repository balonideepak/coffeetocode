package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class SortHotelListUsingThread {

	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new FileReader(new File(
				"reviews.txt")));
		String searchKeywords = br.readLine();
		if (null == searchKeywords || searchKeywords.length() == 0) {
			br.close();
			return;
		}

		String[] searchKeywordsArr = searchKeywords.split(" ");
		Set<String> dict = new HashSet<String>();
		for (String word : searchKeywordsArr) {
			dict.add(word.toLowerCase());
		}

		Map<Integer, Integer> hotelsMap = new HashMap<Integer, Integer>();

		int noOfReviews = Integer.parseInt(br.readLine());

		Thread thread = null;
		final CountDownLatch latch = new CountDownLatch(noOfReviews);
		for (int i = 1; i <= noOfReviews; i++) {
			thread = new Thread(new Task(br, hotelsMap, dict, latch), "" + i);
			thread.start();
		}

		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<Map.Entry<Integer, Integer>> sorted = new ArrayList<Map.Entry<Integer, Integer>>(
				hotelsMap.entrySet());
		Collections.sort(sorted, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1,
					Map.Entry<Integer, Integer> o2) {
				if (o1.getValue() == o2.getValue()) {
					return o1.getKey() - o2.getKey();
				} else {
					return o2.getValue() - o1.getValue();
				}
			}
		});

		for (Map.Entry<Integer, Integer> hotelEntry : sorted) {
			System.out.print(hotelEntry.getKey() + " ");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken=" + ((end - start) ));

	}

}


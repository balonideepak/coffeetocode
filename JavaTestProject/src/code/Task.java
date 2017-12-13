package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

class Task implements Runnable {

	private BufferedReader br = null;
	private Map<Integer, Integer> hotelsMap = null;
	private Set<String> dict = null;
	private CountDownLatch latch = null;

	public Task() {
	}

	public Task(BufferedReader br, Map<Integer, Integer> hotelsMap,
			Set<String> dict, CountDownLatch latch) {
		this.br = br;
		this.hotelsMap = hotelsMap;
		this.dict = dict;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			String line;
			int hotelIntId;
			String hotelId;

			while ((line = br.readLine()) != null) {
				hotelId = Thread.currentThread().getName();
				if (hotelId.trim().equals(line.trim())) {
					hotelIntId = Integer.parseInt(hotelId);
					if (!hotelsMap.containsKey(hotelIntId)) {
						hotelsMap.put(hotelIntId, 0);
					}

					// Read review text
					String[] review = br.readLine().split(" ");
					for (String word : review) {
						// Remove any ' ', ',', '.', '!' or '?' from word
						word = word.replaceAll("[$,.!?]", "").toLowerCase();
						if (dict.contains(word)) {
							hotelsMap.put(hotelIntId,
									hotelsMap.get(hotelIntId) + 1);
						}
					}

				}
			}

			latch.countDown();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.hly.bloom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String[] args) throws Exception {
		int capicity = 1430000;
		int initDataSize = 1000000;
		BloomFilter bloomfilter = new BloomFilter(capicity, initDataSize, 8);
		System.out.println("Bloom Filter Initialize ... ");
		bloomfilter.init("d:/data/base.txt");
		System.out.println("Bloom Filter Ready");
		System.out.println("False Positive Probability : " + bloomfilter.getFalsePositiveProbability());

		/// 查找新数据
		List<String> result = new ArrayList<String>();
		long t1 = System.currentTimeMillis();
		BufferedReader reader = new BufferedReader(new FileReader(
				"d:/data/input.txt"));
		String line = reader.readLine();
		while (line != null && line.length() > 0) {
			if (!bloomfilter.contains(line)) {
				result.add(line);
			}
			line = reader.readLine();
		}
		reader.close();
		long t2 = System.currentTimeMillis();
		System.out.println("Parse 1000000 items, Time : " + (t2 - t1)
				+ "ms , find " + result.size() + " new items.");
//		System.out.println("Average : " + 9900000 / ((t2 - t1) / 1000)
//				+ " items/second");
	}
}

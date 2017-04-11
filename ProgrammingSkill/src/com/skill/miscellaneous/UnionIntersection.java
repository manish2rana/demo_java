package com.skill.miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class UnionIntersection {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 4,9};
		int[] b = { 2,7,8,9};

		findBoth(a, b);

	}

	@SuppressWarnings("rawtypes")
	public static void findBoth(int a[], int b[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (hashMap.containsKey(a[i])) {
				hashMap.put(a[i], hashMap.get(a[i]) + 1);
			} else {
				hashMap.put(a[i], 1);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (hashMap.containsKey(b[i])) {
				hashMap.put(b[i], hashMap.get(b[i]) + 1);
			} else {
				hashMap.put(b[i], 1);
			}
		}

		List<Integer> unionList = new ArrayList<Integer>();
		List<Integer> intersectionList = new ArrayList<Integer>();
		Iterator it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry ev = (Entry) it.next();
			int val = (int) ev.getValue();
			if (val > 1) {
				intersectionList.add((Integer) ev.getKey());
			}
			unionList.add((Integer) ev.getKey());

		}
		System.out.println("Union = "+unionList);
		System.out.println("Intersection = "+intersectionList);
	}

}

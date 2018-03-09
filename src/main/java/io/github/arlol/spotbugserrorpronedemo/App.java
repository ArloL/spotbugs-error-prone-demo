package io.github.arlol.spotbugserrorpronedemo;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class App {

	public static void main(String[] args) {
		Multimap<Integer, String> multimap = HashMultimap.create();
		if (multimap.put(0, "A")) {
			System.out.println("success");
		}
		// can be ignored
		multimap.put(0, "A");
	}

}

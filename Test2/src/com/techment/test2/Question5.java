package com.techment.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Question5 {

	public static void main(String[] args) {
Map<Integer,Integer> vMap =new HashMap();
		vMap.put(1, 20);
		vMap.put(2, 5);
		vMap.put(3, 44);
		vMap.put(4, 32);
		vMap.put(5, 65);
		vMap.put(6, 9);
		vMap.put(7, 90);
		vMap.put(8, 15);
		vMap.put(9, 29);
		vMap.put(10, 19);
		
		List<Integer> listOfVoters = voterList(vMap);
		
	  System.out.println("Valid Ids are : ");
		for(Integer vId : listOfVoters) {
			System.out.println(vId);
		}
		
	}

	private static List<Integer> voterList(Map<Integer, Integer> vMap) {
		List<Integer> validVoter = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry : vMap.entrySet()) {
			if(entry.getValue() > 18) 
			   validVoter.add(entry.getKey());
			}

		return validVoter;
	}

	
}
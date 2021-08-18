package com.techment.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();
	    arrayList.add(3);//1
	    arrayList.add(7);//2
	    arrayList.add(8);//3
	    arrayList.add(9);//4

	    int mid = (int) Math.ceil(arrayList.size() / 2.0);
	    List<Integer> arrayList1=arrayList.subList(0, mid);
		List<Integer> arrayList2=arrayList.subList(mid, arrayList.size());
		System.out.println(arrayList1);
		System.out.println(arrayList2);
		System.out.println("maximum of 1st list: "+Collections.max(arrayList1));
		System.out.println("maximum of 2nd list: "+Collections.max(arrayList2));


	}

}

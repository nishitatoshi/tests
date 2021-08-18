package com.techment.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class WWE
{
	private String firstName;
	private String lastName;
	private int weight;
	
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstName=" + firstName + ", lastName=" + lastName + ", weight=" + weight + "]";
	}
	
	
}
public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		wwe.add(new WWE("Nishita", "Toshi", 52));
		wwe.add(new WWE("Mohima", "Sinha", 48));
		wwe.add(new WWE("Ankit", "Kumar", 222));
		wwe.add(new WWE("Sanika", "Awasthi", 55));
		wwe.add(new WWE("Satyam", "Sahu", 273));
		
		WWEWrestlerImplementation wImplementation = new WWEWrestlerImplementation();
		
		//display all
		wwe.stream().forEach(s->System.out.println(s));

		//count
		Long wcount =wwe.stream().count();
		System.out.println("total num of wrestlers: "+wcount);
		
		//sum of weights of wrestlers above 200
		Long totalWeight = wwe.stream().filter(e->e.getWeight()>200).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
		System.out.println("total weight: "+totalWeight);
		
		//display first names
		System.out.println("====first names===");
		wImplementation.allFirstNames(wwe);
		
		//display minimum weight
		System.out.println("minimum weight: "+wImplementation.minWeight(wwe));

	}

	/*
	 * Description: method to display first names of all the wrestlers
	 */
	void allFirstNames(ArrayList<WWE> wwe)
	{
		Map<String, List<WWE>> allfirsts = wwe.stream().collect(Collectors.groupingBy(WWE::getFirstName));
		System.out.println(allfirsts);
		
	}
	
	/*
	 * Description: method to display minimum weight
	 */
	int minWeight(ArrayList<WWE> wwe)
	{
		int minw = wwe.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
		return minw;
	}


}

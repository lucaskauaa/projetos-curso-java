package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.People;

public class Program {
	public static void main(String[] args) {

		List<People> list = new ArrayList<>();
		
		list.add(new People("Lucas", 22));
		list.add(new People("Maria", 30));
		list.add(new People("José", 19));
		
		Collections.sort(list);
		
		for (People people : list) {
			System.out.println(people.getName() + ", " + people.getAge());
		}
	}
}
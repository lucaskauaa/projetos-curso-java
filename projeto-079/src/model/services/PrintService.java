package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> elements = new ArrayList<>();
	
	public PrintService() {
	}
	
	public void addValue(T value) {
		elements.add(value);
	}
	
	public T first() {
		if (elements.isEmpty()) {
			throw new IllegalStateException("List is empty");
		} 
		return elements.getFirst();
	}
	
	public void print() {
		StringBuilder text = new StringBuilder();
		
		text.append("[");
		
		for (int i = 0; i < elements.size(); i++) {
			text.append(elements.get(i));
			
			if (i + 1 != elements.size()) {
				text.append(", ");
			}
		}
		
		text.append("]");
		
		System.out.println(text);
	}
}

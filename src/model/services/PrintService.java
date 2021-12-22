package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();

	public void addValue(T value) {
      list.add(value);
	}

	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return  (T) list.get(0);

	}

	public void print() {
           for (T value : list) {
			System.out.print("["+value+"] ");
		} 
	}
}

package org.encap;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Text {
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.setId(100);
		p.setName("Praneet");
		Practice p1 = new Practice();
		p1.setId(200);
		p1.setName("Zeni");
		
		List<Practice> l = new LinkedList<>();
		l.add(p);
		l.add(p1);
		for (int i = 0; i < l.size(); i++) {
			int id = l.get(i).getId();
			String name = l.get(i).getName();
			System.out.println(id);
			System.out.println(name);
		
		}
		
		Set<Practice> s = new LinkedHashSet<>();
		s.add(p);
		s.add(p1);
		for (Practice practice : s) {
			int id = practice.getId();
			System.out.println(id);
			
			String name = practice.getName();
			System.out.println(name);
			
		}
		
	}

}

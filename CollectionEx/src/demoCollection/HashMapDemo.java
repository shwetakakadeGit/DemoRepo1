package demoCollection;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Shweta", 45.56);
		Student s2 = new Student(13, "Sher", 85.56);
		Student s3 = new Student(51, "LMN", 34.56);
		Student s4 = new Student(12, "ABC", 56.56);
		Student s5 = new Student(111, "XYZ", 75.56);
		Student s6 = new Student(7891, "PQR", 77.56);

		HashMap<Integer, Student> hm = new HashMap<Integer, Student>();

		hm.put(1, s1);
		hm.put(34, s2);
		hm.put(33, s3);
		hm.put(67, s4);
		hm.put(45, s5);
		hm.put(32, s6);
		
		/*
		 * //1. Iteration Using KeySet Set<Integer> keys=hm.keySet(); for(Integer
		 * K:keys) System.out.println(K+" "+hm.get(K) );
		 */
		
		// 2. Using entries Set
		
		Set<Entry<Integer, Student>> e =hm.entrySet();
		
		for(Entry<Integer, Student> entries:e) {
			System.out.println(entries);
			//System.out.println(K+" "+hm.get(K) );
		}
		
		
		
		
		
		
		
		
		
	}
}
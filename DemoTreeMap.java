package apjfsa;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(1, "Developer");
		tmap.put(2, "Tester");
		tmap.put(3,"Tech Support");
		tmap.put(4, "Data Analyst");
		tmap.put(69,"Admin");
		tmap.put(22, "Team Leader");
		tmap.put(9,"Quality Assosiate");
		tmap.put(45, "Manager");
		tmap.put(88, "Product Manager");
		tmap.put(13,"HR");
		
		tmap.put(0,null);
		
		System.out.println(tmap);
		
		TreeMap<Double,Integer> tmap1=new TreeMap <Double,Integer>();
		tmap1.put(32.05,200);
		tmap1.put(45.62, 100);
		
		System.out.println(tmap1.floorKey(33.01));
		System.out.println(tmap1.floorKey(46.09));
		
		}

}

package Task12;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

class Employee {
	  private int id;
	  private String name;

	  // Constructor
	  public Employee (int id, String name) {
	    this.id = id;
	    this.name = name;
	  }

	  // Getters
	  public int getId () {
	    return id;
	  }

	  public String getName () {
	    return name;
	  }
	}

	class NameComparator implements Comparator<Employee> {
	  public int compare (Employee e1, Employee e2) {
	    return e1.getName ().compareTo (e2.getName ());
	  }
	}

	public class TreeMapex1 {
	  public static void main (String [] args) {
	    TreeMap<Integer, Employee> tm = new TreeMap<> ();
	    tm.put (101, new Employee (101, "ARUN"));
	    tm.put (102, new Employee (102, "BALA"));
	    tm.put (103, new Employee (103, "CHITRA"));
	    tm.put (104, new Employee (104, "DAVID"));

	    NameComparator nc = new NameComparator ();
	    

	    for (Entry<Integer, Employee> entry : tm.entrySet ()) {
	      Employee e = entry.getValue ();
	      System.out.println (e.getName ());
	    }
	    
	}
	  
	}
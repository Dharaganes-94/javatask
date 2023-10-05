package Task12;

import java.util.LinkedList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.add("pink");
		l.add("orange");
		l.add("black");
		
        String[] arr = new String[l.size()];
        
        for (int i = 0; i < l.size(); i++)
            arr[i] = (String) l.get(i);
        
        for (String s : arr)
            System.out.print(s + " ");

		

	}

}

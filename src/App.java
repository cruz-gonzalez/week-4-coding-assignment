import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Cruz");
		employeeNames.add("Breanna");
		employeeNames.add("Eli");
		employeeNames.add("Sam");
		employeeNames.add("Mondo");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(21);
		ids.add(26);
		ids.add(17);
		ids.add(3);
		ids.add(6);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		for (int currentId : ids)
		{
			employeeMap.put(currentId , employeeNames.get(i));
			
			i++;
		}
		
		
		for (int key : employeeMap.keySet())
		{
			System.out.println(key + " = " + employeeMap.get(key));
		}
		
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (int currentId : ids)
		{
			idsBuilder.append(currentId + " - ");
		}
		System.out.println(idsBuilder.toString());
		
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String currentName : employeeNames)
		{
			namesBuilder.append(currentName + " ");
		}
		System.out.println(namesBuilder.toString());
		
		

	}

}

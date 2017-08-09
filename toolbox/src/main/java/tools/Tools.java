package tools;

import java.util.ArrayList;
import java.util.List;

public class Tools {
	
	private static List<Tool> tools = new ArrayList<Tool>();
	
	static {
		tools.add(new Tool("Hammer"));
		tools.add(new Tool("Screw"));
		tools.add(new Tool("Nail"));
	}
	
	public List<Tool> toolList(){
		return tools;	
	}
	
	public void add(String name){
		tools.add(new Tool(name));
	}
	
	public void add(String name, String cat){
		tools.add(new Tool(name, cat));
	}
	
	public void sortByName(){
		tools.sort(new NameComparator());	
	}
	
	public void  sortByCategory(){
		tools.sort(new CategoryComparator());
	}
	
	public void delete(String id){	
		Tool temp = null;
		for(Tool t: tools){
			if(t.getId() == Integer.parseInt(id)){
				temp = t;
				break;
			}
		}
		tools.remove(temp);
	}
	
	public void editNC(String id, String name, String category){	
		for(Tool t: tools){
			if(t.getId() == Integer.parseInt(id)){
				t.setName(name);
				t.setCategory(category);
				break;
			}
		}
		
	}
	
	public void editN(String id, String name){	
		for(Tool t: tools){
			if(t.getId() == Integer.parseInt(id)){
				t.setName(name);
				break;
			}
		}
		
	}
	
	public void editC(String id, String category){			
		for(Tool t: tools){
			if(t.getId() == Integer.parseInt(id)){
				t.setCategory(category);
				break;
			}
		}
	}
}

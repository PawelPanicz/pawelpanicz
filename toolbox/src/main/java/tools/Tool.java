package tools;

public class Tool {
	
	private String name;
	private String category;
	private int id;

	private static int count;
	
	
	public Tool(String name){
		super();
		this.name = name;
		this.category = "tool";
		this.setId(count);
		count++;
	}
	
	public Tool(String name, String category){
		super();
		this.name = name;
		this.category = category;
		this.setId(count);
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name = " + name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

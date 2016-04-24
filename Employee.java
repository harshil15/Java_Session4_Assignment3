package acadgild;

public class Employee {
	private String name;
	private int age;
	private String work;
	private String dept;
	private String address;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setAge(28);
		emp1.setName("Donald");
		emp1.setDept("Operational");
		emp1.setWork("Analyst");
		emp1.setAddress("New York");
		System.out.println(emp1.getAge());
		System.out.println(emp1.getName());
		System.out.println(emp1.getDept());
		System.out.println(emp1.getWork());
		System.out.println(emp1.getAddress());
		
	}

}

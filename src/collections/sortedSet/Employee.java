package collections.sortedSet;



public class Employee implements Comparable<Employee> {

	int id;
	String empName;
	String dept;
	double salary;

	public Employee(int id, String empName, String dept, double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}



	//we cant create separate comparable class on Comparable interface,we can create by Comparator interface

	//Sort by empName ,if same name then compare by id
	@Override
	public int compareTo(Employee o) {
		int comparison=0;
		comparison= this.empName.compareTo(o.getEmpName());
		if(comparison==0) {
			comparison=Integer.compare(id, o.id);
			//OR, following way also copare id
			//comparison=this.id-o.getId();
		}
		return comparison;
	}



	/*	//Sort by salary wise,if same salary compare by dept 
	@Override
	public int compareTo(Employee o) {
		int comparison=0;
		comparison=(int) (this.salary-o.salary);
		if(comparison==0) {
			comparison=dept.compareTo(o.getDept());
		}
		return comparison;
	}   */






}

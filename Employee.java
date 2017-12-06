
public class Employee {

 private int empno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private String ename;
	
	 @Override
		public boolean equals(Object obj) {
		 
		 Employee emp=(Employee)obj;
		 if(emp.getEmpno()==this.empno ){
			 return true;
		 }
			return false;
		}
	 @Override
		public int hashCode() {
			
			return  empno;
					}
	
	@Override
		public String toString() {
			
			return empno+" "+ename;
		}
}

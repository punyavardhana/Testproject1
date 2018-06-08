
public class Encapsulation 

{
	 // private data variables 
     private int ssn;
     private String empname;
     private int empage;
     
     
     public static void main (String args[])
     {     
     
    	 Encapsulation emp = new Encapsulation();
    	 
    	 emp.setSsn(1234567);
    	 emp.setEmpname("ravi");
    	 emp.setEmpage(43);
    	 
    	 
    	 System.out.println("the ssn number of the person is :" + emp.getSsn());
    	 System.out.println("the name of the person is :" + emp.getEmpname());
    	 System.out.println("the age of the person is :" + emp.getEmpage());
    	 
    	      }
     
     //we need to define getter and setter methods will be public in nature  
     
	public int getSsn() {
		return ssn;
	}
	
	public void setSsn(int ssn) 
	{
		this.ssn = ssn;
	}
	
	public String getEmpname()
	{
		return empname;
	}
	
	public void setEmpname(String empname)
	{
		this.empname = empname; // this.classvariable is equal to local variable
	}
	
	public int getEmpage()
	{
		return empage;
	}
	
	public void setEmpage(int empage)
	
	{
		this.empage = empage;
	}
     
     
    
		
}

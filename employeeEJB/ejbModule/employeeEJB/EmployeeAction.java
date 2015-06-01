package employeeEJB;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bean.Employee;



@Stateful
@LocalBean

public class EmployeeAction {

	@PersistenceContext
    EntityManager em;
	
	public EmployeeAction() {
		
	}
	
	public void insert(String uid,String name, int phn_no, String gender, String address,
			String email, String pancardno, int adhaarcardno, int experience,
			Date doj, Date dob) {
		
		em.persist(new Employee(uid, name, phn_no, gender, address, email, pancardno, adhaarcardno, experience,
			doj, dob));		
	}

	 public Employee removeEmp(String id) {
	    	Employee ob = em.find(Employee.class, id);
	    	  	em.remove(ob);
	    	  	return ob;
	    }
	    
	    public Employee findEmp(int id) {
	    	Employee ob = em.find(Employee.class, id);
	    	return  ob;
	    }
	    
	    public Employee updateData(String uid,String name, int phn_no, String gender, String address,
				String email, String pancardno, int adhaarcardno, int experience,
				Date doj, Date dob) {
	    	
	    	Employee ob = em.merge(new Employee(uid, name, phn_no, gender, address, email, pancardno, adhaarcardno, experience,
	    			doj, dob));
	    	return  ob; 
	    }
	
	
}

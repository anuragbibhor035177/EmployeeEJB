package employeeEJB;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateful
@LocalBean

public class EmployeeAction {

	@PersistenceContext
    EntityManager em;
	
	public EmployeeAction() {
		
	}
	
}

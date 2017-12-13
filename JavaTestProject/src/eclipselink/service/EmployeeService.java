package eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eclipselink.entity.Employee;

public class EmployeeService {
	private static EntityManager em = null;

	static {
		em = Persistence.createEntityManagerFactory("Eclipselink_JPA")
				.createEntityManager();
	}

	public static void main(String[] args) {
		createEmployee();
	}

	private static void createEmployee() {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Employee employee = new Employee(1, "John");
		em.persist(employee);
		transaction.commit();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		em.close();
	}
}

package ex;

import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class SelectEmployees {
	public static void main(String[] args) {
		// EMPLOYEESテーブルの全レコードを取得
		EmployeeDAO empDAO = new EmployeeDAO();
		List<Employee> empList = empDAO.findAll();
		
		// 取得したレコードの内容を出力
		for (Employee emp : empList) {
			System.out.println("ID:" + emp.getId());
			System.out.println("NAME:" + emp.getName());
			System.out.println("AGE:" + emp.getAge() + "\n");
		}
	}
}
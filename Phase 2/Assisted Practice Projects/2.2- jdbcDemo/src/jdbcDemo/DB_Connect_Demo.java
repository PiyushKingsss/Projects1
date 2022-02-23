package jdbcDemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DB_Connect_Demo {
static Connection con = null;
	
	public static void main(String[] args) throws Exception {
		DB_Connect_Demo demo = new DB_Connect_Demo();
		demo.getConnection();
		Employee emp = demo.selectEmployeesByID(1004);
		//selectEmployeesByID();
		//selectAllEmployees();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getGender());
		
	}
	
	public static void getConnection() throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "tiger";
		con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connection Success");
	}
	
	public static void selectAllEmployees() throws Exception {
		String query = "select * from employee";
		System.out.println("Query:" + query);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t ");
			System.out.print(rs.getString(2) + "\t ");
			System.out.print(rs.getFloat(3) + " \t");
			System.out.print(rs.getString(4) + " \t");
			System.out.println();
	}
		
	}
	
	public Employee selectEmployeesByID(int empId) throws Exception {
		String query = "select * from employee where empid = " + empId;
		System.out.println("Query:" + query);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		int id =0;
		String name= "";
		String gender = "";
		float salary = 0f;
		Employee emp = new Employee();
		if(rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			salary = rs.getFloat(3);
			gender = rs.getString(4);
			emp.setEmpId(id);
			emp.setGender(gender);
			emp.setSalary(salary);
			emp.setName(name);
			}
		return emp;
		}

		
	
	public void insertEmployee(Employee emp) throws Exception {
		String query = "insert into employee values(" + emp.getEmpId() + " , " + emp.getName() + ", "
+ emp.getSalary() + ", " + emp.getGender() + ")";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Success");
	}
	/*
	public void deleteEmployee(int empId) throws Exception {
		String query = "delete from employee where empid =" + empId;
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Success");
	}
	
	public void updateEmployee(Employee emp) throws Exception {
		String query = "update employee set name =" + emp.getName() + "where epid ="+ emp.getEmpId();
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Success");
	}*/
}
		

		
	

	
	
	

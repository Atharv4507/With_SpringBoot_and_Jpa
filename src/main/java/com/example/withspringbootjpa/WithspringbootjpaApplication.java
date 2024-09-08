package com.example.withspringbootjpa;

import java.util.List;
// import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.withspringbootjpa.model.Employee;
import com.example.withspringbootjpa.service.EmployeeService;

@SpringBootApplication
public class WithspringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(WithspringbootjpaApplication.class, args);
		EmployeeService es = context.getBean(EmployeeService.class);
		/*Insertion */
		// Employee e = new Employee();
		// e.setEid(45);
		// e.setEname("Gandhi");
		// e.setEdesignation("developer");
		// e.setEcompany("tcs");
		// e.setEsalary(70000.90);
		// System.out.println(es.save(e));
		// for(int i=1;i<=1000;i++){
		// 	Employee e1 = new Employee();
		// 	StringBuilder name = new StringBuilder();
		// 	StringBuilder designation = new StringBuilder();
		// 	StringBuilder company = new StringBuilder();
		// 	for(int j =1;j<=6;j++){
		// 		name.append((char)(new Random().nextInt(26)+65));
		// 		designation.append((char)(new Random().nextInt(26)+65));
		// 		company.append((char)(new Random().nextInt(26)+65));
		// 	}
		// 	e1.setEname(name.toString());
		// 	e1.setEdesignation(designation.toString());
		// 	e1.setEcompany(company.toString());
		// 	e1.setEsalary(new Random().nextDouble()*100000);
		// 	es.save(e1);
		// }
		
		/*deletionById */
		// System.out.println(es.deleteByEid(3));

		/*deleteByName */
		// System.out.println(es.deleteByEname("IJDGJT"));

		/*findById */
		Employee e2= es.findById(6);
		System.out.println(es.findById(6));
		e2.setEname("ganesh");
		e2.setEcompany("tcs");
		System.out.println(es.save(e2));


		/*findByEidAndEname */
		Employee e3 = es.findByEidAndEname(10, "WDXYVG");
		System.out.println(es.save(e3));

		/*findByEidOrEname */
		List<Employee> list1 = es.findByEidOrEname(45,"OWBJJG");
		for(Employee e:list1 ){
			System.out.println(e);
		}

		/*findByEidLessThan */
		List<Employee> list2 = es.findByEidLessThan(10);
		for(Employee e: list2){
			System.out.println(e);
		}

		/*findByEidBetween */
		List<Employee> list3 = es.findByEidBetween(10,30);
		for(Employee e: list3){
			System.out.println(e);
		}

		/*findByEidIsNotBetween */
		List<Employee> list4 = es.findByEidIsNotBeatween(1,990);
		for(Employee e: list4){
			System.out.println(e);
		}
	}

}

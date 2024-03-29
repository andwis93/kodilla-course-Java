package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John","Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Gray Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        long softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        long dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        long greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0,dataMastersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
//        try {
//        companyDao.deleteById(softwareMachineId);
//        companyDao.deleteById(dataMastersId);
//        companyDao.deleteById(greyMatterId);
//         } catch (Exception e) {
//       //   do nothing
//         }
    }

   @Test
   void testNamedQueries() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Gray Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        employeeDao.save(johnSmith);
        String johnSmithName = johnSmith.getLastName();
        employeeDao.save(stephanieClarckson);
        String stephanieClarcksonName = stephanieClarckson.getLastName();
        employeeDao.save(lindaKovalsky);
        String lindaKovalskyName = lindaKovalsky.getLastName();

        //When
        List<Employee> finByName = employeeDao.findEmployeeByName("Clarckson");

        //Then
//        try {
//            assertEquals(1, finByName.size());
//
//        //CleanUp
//        } finally {
//            employeeDao.deleteByLastName(johnSmithName);
//            employeeDao.deleteByLastName(stephanieClarcksonName);
//            employeeDao.deleteByLastName(lindaKovalskyName);
//        }
    }

    @Test
    void testNamedNativeQueries() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Gray Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        String softwareMachineName = softwareMachine.getName();
        companyDao.save(dataMasters);
        String dataMasterName = dataMasters.getName();
        companyDao.save(greyMatter);
        String greyMatterName = greyMatter.getName();

        //When
        List<Company> findByFirstThreeLetters = companyDao.findCompanyByFirstTreeLetters("Gra");

        //Then
//        try {
//            assertEquals(1, findByFirstThreeLetters.size());

        //CleanUp
//        } finally {
//            companyDao.deleteByName(softwareMachineName);
//            companyDao.deleteByName(dataMasterName);
//            companyDao.deleteByName(greyMatterName);
//        }
    }

}

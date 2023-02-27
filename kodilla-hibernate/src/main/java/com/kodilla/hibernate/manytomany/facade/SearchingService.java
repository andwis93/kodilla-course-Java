package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingService {

    private CompanyDao companyDao;

    private EmployeeDao employeeDao;

    @Autowired
    public SearchingService(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void addEmployeesAndCompaniesToDataBase(){
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
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);
    }

    public void deleteCompanyFromDataBase() {
        companyDao.deleteByName("Software Machine");
        companyDao.deleteByName("Data Masters");
        companyDao.deleteByName("Gray Matter");
    }

    public void deleteEmployeeFromDataBase() {
        employeeDao.deleteByLastName("Smith");
        employeeDao.deleteByLastName("Clarckson");
        employeeDao.deleteByLastName("Kovalsky");
    }

    public List<Company> searchingCompanies(String arg) {
        return companyDao.findCompanyByScrap("%" + arg + "%");

    }

    public List<Employee> searchingEmployees(String arg) {
        return employeeDao.findEmployeeByScrap("%" + arg + "%");
    }
}

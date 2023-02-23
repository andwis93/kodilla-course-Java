package com.kodilla.matrix.hibernate.manytomany.facade;

import com.kodilla.matrix.hibernate.manytomany.Company;
import com.kodilla.matrix.hibernate.manytomany.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SearchingFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);
    private final SearchingService searchingService;

    @Autowired
    public SearchingFacade(SearchingService searchingService) {
        this.searchingService = searchingService;
    }

    public void processSearching(String arg) throws SearchingProcessingException {
        try {
            LOGGER.info("Adding Companies and Employees");
            try {
                searchingService.addEmployeesAndCompaniesToDataBase();
                LOGGER.info("Companies and Employees were added successfully");
            }catch (Exception e){
                throw new SearchingProcessingException(SearchingProcessingException.ERR_NOT_ADDED);
            }
            LOGGER.info("Finding companies comprising: " + "\"" + arg + "\"");
            List<Company> companyList = searchingService.searchingCompanies(arg);
            String companyPlural = companyList.size() == 1 ? "company" : "companies";
            if (companyList.size() > 0) {
                LOGGER.info("There is " + companyList.size() + " " + companyPlural + " comprising " + "'" + arg + "'");
            } else {
                LOGGER.error(SearchingProcessingException.ERR_NOT_FOUND_COMPANY);
                throw new SearchingProcessingException(SearchingProcessingException.ERR_NOT_FOUND_COMPANY);
            }
            LOGGER.info("Finding employees comprising: " + "\"" + arg + "\"");
            List<Employee> employeesList = searchingService.searchingEmployees(arg);
            String employeePlural = employeesList.size() == 1 ? "employee" : "employees";
            if (employeesList.size() > 0) {
                LOGGER.info("There is " + employeesList.size() + " " + employeePlural + " comprising " + "'" + arg + "'");
            } else {
                LOGGER.error(SearchingProcessingException.ERR_NOT_FOUND_EMPLOYEE);
                throw new SearchingProcessingException(SearchingProcessingException.ERR_NOT_FOUND_EMPLOYEE);
            }
            LOGGER.info("Deleting Companies");
            try {
                searchingService.deleteCompanyFromDataBase();
                LOGGER.info("Companies were deleted successfully");
            }catch (Exception e){
                throw new SearchingProcessingException(SearchingProcessingException.ERR_NOT_DELETED_COMPANY);
            }
            LOGGER.info("Deleting Employees");
            try {
                searchingService.deleteEmployeeFromDataBase();
                LOGGER.info("Employees were deleted successfully");
            }catch (Exception e){
                throw new SearchingProcessingException(SearchingProcessingException.ERR_NOT_DELETED_EMPLOYEE);
            }
        } finally {}
    }

}

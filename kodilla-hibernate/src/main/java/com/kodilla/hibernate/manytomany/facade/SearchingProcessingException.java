package com.kodilla.hibernate.manytomany.facade;

public class SearchingProcessingException extends Exception {

    public static String ERR_NOT_FOUND_COMPANY = "Company not found.";
    public static String ERR_NOT_FOUND_EMPLOYEE = "Employee not found.";
    public static String ERR_NOT_ADDED = "Couldn't add companies and employees.";
    public static String ERR_NOT_DELETED_EMPLOYEE = "Couldn't delete employees.";
    public static String ERR_NOT_DELETED_COMPANY = "Couldn't delete companies.";

    public SearchingProcessingException(String message) {
        super(message);
    }

}

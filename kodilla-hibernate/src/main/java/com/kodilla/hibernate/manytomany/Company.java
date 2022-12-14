package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Company.findCompanyByScrap",
        query = "FROM Company WHERE name LIKE :ARG"
)
@NamedNativeQuery(
        name = "Company.findCompanyByFirstTreeLetters",
        query = "SELECT * FROM COMPANY WHERE LEFT(COMPANY_NAME, 3) = :FIRSTTREELETTERS",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANY")
public class Company {
    private long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public long getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}

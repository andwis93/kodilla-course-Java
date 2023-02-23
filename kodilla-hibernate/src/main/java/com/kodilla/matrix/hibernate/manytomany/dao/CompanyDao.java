package com.kodilla.matrix.hibernate.manytomany.dao;

import com.kodilla.matrix.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Long> {
    List<Company> deleteByName(String name);
    @Query
    List<Company> findCompanyByFirstTreeLetters(@Param("FIRSTTREELETTERS") String firstTreeLetters);
    @Query
    List<Company> findCompanyByScrap(@Param("ARG") String arg);


}

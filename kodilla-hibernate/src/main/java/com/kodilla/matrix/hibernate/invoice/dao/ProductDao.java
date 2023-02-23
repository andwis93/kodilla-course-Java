package com.kodilla.matrix.hibernate.invoice.dao;

import com.kodilla.matrix.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product,Long> {
}

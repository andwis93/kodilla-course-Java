package com.kodilla.matrix.hibernate.invoice.dao;

import com.kodilla.matrix.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Long> {
}

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
  //  List<Product> findByName(String name);
}

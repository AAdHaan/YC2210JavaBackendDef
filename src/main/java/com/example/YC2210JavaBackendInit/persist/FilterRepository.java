package com.example.YC2210JavaBackendInit.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.Filter;

@Component
public interface FilterRepository extends CrudRepository<Filter, Long>{ 

}

package com.ianVinales.product_microservice.repository;

import com.ianVinales.product_microservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<ProductEntity,String> {



}

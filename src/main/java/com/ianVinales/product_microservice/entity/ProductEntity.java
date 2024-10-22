package com.ianVinales.product_microservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value= "product")
@Getter
@Setter
@NoArgsConstructor//constructor sin argumentos
public class ProductEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;


}

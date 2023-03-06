package com.app.Restaurant.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;


@NamedQuery(name = "Category.getAllCategory",query = "select c from Category c")

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name ="category")
public class Category implements Serializable {

    private static final  long serialVerionUID =1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
}

package com.uribio.handsonjavaspring.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_category")
  private Integer idCategory;
  private String name;
  private Boolean active;

  @OneToMany(mappedBy = "category")
  private List<Product> products;

  public Integer getIdCategory() {
    return idCategory;
  }

  public void setIdCategory(Integer idCategory) {
    this.idCategory = idCategory;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }
}

package com.uribio.handsonjavaspring.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable {
  @Column(name="id_order")
  private Integer idOrder;

  @Column(name="id_product")
  private Integer idProduct;

  public Integer getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Integer idOrder) {
    this.idOrder = idOrder;
  }

  public Integer getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Integer idProduct) {
    this.idProduct = idProduct;
  }
}

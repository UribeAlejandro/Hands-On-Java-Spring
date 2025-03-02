package com.uribio.handsonjavaspring.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetail {
  @EmbeddedId
  private OrderDetailPK id;
  private Integer quantity;
  private Double total;
  private Boolean status;

  @ManyToOne
  @JoinColumn(name="id_order", insertable = false, updatable = false)
  private Order order;

  @ManyToOne
  @JoinColumn(name="id_product", insertable = false, updatable = false)
  private Product product;

  public OrderDetailPK getId() {
    return id;
  }

  public void setId(OrderDetailPK id) {
    this.id = id;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }
}

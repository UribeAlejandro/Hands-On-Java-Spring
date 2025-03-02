package com.uribio.handsonjavaspring.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;
import java.util.List;


@Entity
@Table(name="orders")
public class Order {

  @Id
  @Column(name = "id_order")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idOrder;

  @Column(name = "id_customer")
  private Integer idCustomer;

  private ZonedDateTime date;

  private String paymentMethod;

  private String comment;

  private String status;

  @ManyToOne
  @JoinColumn(name = "id_customer", insertable = false, updatable = false)
  private Customer customer;

  public Integer getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Integer idOrder) {
    this.idOrder = idOrder;
  }

  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public ZonedDateTime getDate() {
    return date;
  }

  public void setDate(ZonedDateTime date) {
    this.date = date;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}

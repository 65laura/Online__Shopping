package com.onlineshopping.trial.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.onlineshopping.trial.enums.OrderStates;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "customer_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID orderId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @Column
    private Date date;
    @Column
    private UUID customerId;
    @Enumerated(EnumType.STRING)
    private OrderStates states;

}

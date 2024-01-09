package com.onlineshopping.trial;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID customerId;
    @Column
    private String customerName;
    @Column
    private int customerContact;
    @Column
    private String customerAddress;
    @OneToOne(mappedBy = "customers")
    private User user;
}

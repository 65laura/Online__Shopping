package com.onlineshopping.trial.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.onlineshopping.trial.model.Customers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String email;
    @Column
    @JsonAlias("first_name")
    private String firstName;
    @Column
    @JsonAlias("last_name")
    private String lastName;
    @Column
    private  String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customers customers;



}

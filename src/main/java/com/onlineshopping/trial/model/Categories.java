package com.onlineshopping.trial.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;
@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID categoryId;
    @Column
    private String categoryName;
    public enum CategoryType{
        women,
        men,
        kids,
        dresses,home,beauty,electronics,bottoms,
        tops,bags,jewelry,accessories
    };
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

}

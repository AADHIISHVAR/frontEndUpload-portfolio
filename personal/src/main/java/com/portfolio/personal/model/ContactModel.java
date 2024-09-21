package com.portfolio.personal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Contact_Portfolio")
public class ContactModel
{
    @Id
    @SequenceGenerator(name="product_seq", sequenceName="product_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "product_seq")
    private Long id;
    private String name;
    private String mailId;
    private String message;

}

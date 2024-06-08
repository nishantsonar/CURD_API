/* Author @ Nishant Suresh Sonar 
created on 08/06/24 
inside the package - com.example.CURD_API.Entites */
package com.example.CURD_API.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer standard;
    private String schoolName;
    private String address;
    private String email;
    private String phone;


}

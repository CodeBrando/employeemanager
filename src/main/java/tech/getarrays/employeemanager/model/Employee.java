package tech.getarrays.employeemanager.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String mail;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

}

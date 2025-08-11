package com.xworkz.jpaquery.entity;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table(name = "Aadhar_card")
@NamedQuery(name="getAll" ,query="select entity from AadharEntity entity")
@NamedQuery(name = "getEntityByName",query = "select entity from AadharEntity entity where entity.name =:name")
@NamedQuery(name = "getEntityByNameAndPlace" , query = "select entity from AadharEntity entity where entity.name =:name and entity.place =:place")
@NamedQuery(name = "getEntityByNameAndPhoneNum",query = "select entity from AadharEntity entity where entity.name =:name and entity.phoneNumber =:phoneNumber")
@NamedQuery(name = "getEntityByAge",query = "select entity from AadharEntity entity where entity.age >:age")
@NamedQuery(name = "getEntityBtwAge", query = "select entity from AadharEntity entity where entity.age BETWEEN :minAge AND :maxAge")
@NamedQuery(name = "getEntityByEmail",query = "select entity from AadharEntity entity where entity.email =:email")
@NamedQuery(name = "getEntityByPhoneNum",query = "select entity from AadharEntity entity where entity.phoneNumber =:phoneNumber")

public class AadharEntity {
    public AadharEntity() {
        System.out.println("AadharEntity Constructor");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "aadhar_name")
    private String name;

    @Column(name = "aadhar_email")
    private String email;

    @Column(name = "aadhar_age")
    private int age;

    @Column(name = "aadhar_phoneNum")
    private Long phoneNumber;

    @Column(name = "aadhar_place")
    private String place;


    public AadharEntity(String name, String email,int age, long phoneNumber, String place) {
        this.name=name;
        this.email=email;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.place=place;
    }
}

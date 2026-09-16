package MyProject.springboot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    long Id;
    String name;
    String dept;
    String rollNO;
    String email;
    int dob;
    int year;
    float cgpa;
}

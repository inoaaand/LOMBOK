package br.edu.ifpr.cars.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Driver {

    @Id
    @GeneratedValue 
    Long id;
    
    String name;
    
    LocalDate birthDate;

}

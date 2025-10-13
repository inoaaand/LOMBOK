package br.edu.ifpr.cars.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Driver {
    Long id;
    String name;
    LocalDate birthDate;

}

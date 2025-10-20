package br.edu.ifpr.cars.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifpr.cars.domain.Driver;
import br.edu.ifpr.cars.domain.DriverRepository;

@Service
@RestController
public class DriverController {

    @Autowired // INJEÇÃO DE DEPENDÊNCIAS
    DriverRepository driverRepository; // objeto instancia do repositório!

    @GetMapping("/drivers")
    public List<Driver> listDrivers() {
        return driverRepository.findAll();
    }

    @GetMapping("/drivers/{id}")
    public Driver findDrivers(@PathVariable("id") Long id){
        return driverRepository.findById(id).get(); //findById pega um driver optional e usamos o get p pegar do tipo driver
    }

}

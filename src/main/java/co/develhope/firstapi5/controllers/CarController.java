package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarDTO carDTO;
    @GetMapping("/getCar")
    public CarDTO getNewCar(){
        return new CarDTO();
    }
    @PostMapping("/")
    public ResponseEntity<String> postCarBodyAndHttp(@Valid @RequestBody CarDTO car){
        System.out.println(car.toString());
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }
}
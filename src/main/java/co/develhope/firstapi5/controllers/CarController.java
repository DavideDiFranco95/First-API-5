package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarDTO carDTO;
    @GetMapping("/getCar")
    @ResponseBody
    public CarDTO getNewCar(@RequestParam String id,@RequestParam String modelName, @RequestParam(required = false) double price){
        return new CarDTO(id,modelName,price);
    }
    @PostMapping("/")
    public ResponseEntity<String> postCarBodyAndHttp(@RequestBody CarDTO car){
        System.out.println(car.toString());
        return new ResponseEntity<>("Created",HttpStatus.CREATED);
    }
}
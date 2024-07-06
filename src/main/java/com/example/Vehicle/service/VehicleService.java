package com.example.Vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Vehicle.entity.Vehicle;
import com.example.Vehicle.repository.VehicleRepository;

@Service
public class VehicleService {
    @Autowired
    
        
        private VehicleRepository vehicleRepository;
    
        public List<Vehicle> getAllVehicles() {
            return vehicleRepository.findAll();
        }
    


}

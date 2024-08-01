package com.codewithproyects.service.admin;

import com.codewithproyects.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();
}

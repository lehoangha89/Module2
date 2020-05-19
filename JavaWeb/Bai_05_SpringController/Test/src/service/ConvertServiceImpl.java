package service;

import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public double convert(double number1, double number2) {
        return number1*number2;
    }
}

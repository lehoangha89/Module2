package service;

import org.springframework.stereotype.Service;

@Service
public class ChuyenDoiImpl implements ChuyenDoi{

    @Override
    public double result(double number1,double number2) {
        return number1*number2;
    }
}

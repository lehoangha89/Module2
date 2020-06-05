package com.codegym.service.impl;

import com.codegym.model.DichvuDiKem;
import com.codegym.repository.DichvuDikemRepository;
import com.codegym.service.DichvuDikemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DichvuDikemServiceImpl implements DichvuDikemService {
    @Autowired
    private DichvuDikemRepository dichvuDikemRepository;

    @Override
    public Iterable<DichvuDiKem> findAll() {
        return dichvuDikemRepository.findAll();
    }

    @Override
    public void save(DichvuDiKem dichvuDiKem) {
        dichvuDikemRepository.save(dichvuDiKem);
    }
}

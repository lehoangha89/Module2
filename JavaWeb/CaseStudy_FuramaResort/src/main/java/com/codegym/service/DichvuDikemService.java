package com.codegym.service;

import com.codegym.model.DichvuDiKem;

public interface DichvuDikemService {
    Iterable<DichvuDiKem> findAll();
    void save(DichvuDiKem dichvuDiKem);
}

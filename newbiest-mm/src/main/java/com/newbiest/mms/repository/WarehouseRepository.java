package com.newbiest.mms.repository;

import com.newbiest.base.repository.custom.IRepository;
import com.newbiest.mms.model.Warehouse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by guoxunbo on 2019/3/1.
 */
@Repository
public interface WarehouseRepository extends IRepository<Warehouse, String> {

    List<Warehouse> findByWarehouseType(String warehouseType);
}

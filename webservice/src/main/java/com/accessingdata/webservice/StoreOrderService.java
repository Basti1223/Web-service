package com.accessingdata.webservice;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class StoreOrderService {
 
    @Autowired
    private StoreOrderRepository repo;
     
    public List<storeorder> listAll() {
        return repo.findAll();
    }
     
    public void save(storeorder storeorder) {
        repo.save(storeorder);
    }
     
    public storeorder get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

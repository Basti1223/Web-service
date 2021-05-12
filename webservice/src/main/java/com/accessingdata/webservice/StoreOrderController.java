package com.accessingdata.webservice;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class StoreOrderController {
 
    @Autowired
    private StoreOrderService service;
     
    @GetMapping("/storeorders")
    public List<storeorder > list() {
        return service.listAll();
    }
     
    // RESTful API method for Create operation
     
    // RESTful API method for Update operation
     
    // RESTful API method for Delete operation
}

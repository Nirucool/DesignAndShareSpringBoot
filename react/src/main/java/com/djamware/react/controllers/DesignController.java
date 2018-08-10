package com.djamware.react.controllers;

import com.djamware.react.models.Design;
import com.djamware.react.repositories.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class DesignController {
    @Autowired
    DesignRepository designRepository;

    @RequestMapping(method=RequestMethod.POST, value="/design")
    public Design save(@RequestBody Design design) {
        designRepository.save(design);
        return design;
    }

    @RequestMapping(method=RequestMethod.GET, value="/design")
    public Iterable<Design> designDetail() {

        return designRepository.findAll();
    }
}




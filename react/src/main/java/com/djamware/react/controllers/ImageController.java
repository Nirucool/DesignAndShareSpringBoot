package com.djamware.react.controllers;

import com.djamware.react.models.Image;
import com.djamware.react.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ImageController {

    @Autowired
    ImageRepository imageRepository;


    @RequestMapping(method=RequestMethod.POST, value="/image")
    public Image save(@RequestBody Image image) {
        imageRepository.save(image);

        return image;
    }
    @RequestMapping(method=RequestMethod.GET, value="/image")
    public Iterable<Image> loginDetail() {
        return imageRepository.findAll();
    }
}

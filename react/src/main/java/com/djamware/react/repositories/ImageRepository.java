package com.djamware.react.repositories;

import com.djamware.react.models.Image;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, String> {
    @Override
    void delete(Image deleted);

}


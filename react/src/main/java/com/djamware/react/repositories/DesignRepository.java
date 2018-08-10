package com.djamware.react.repositories;

import com.djamware.react.models.Design;
import org.springframework.data.repository.CrudRepository;

public interface DesignRepository extends CrudRepository<Design, String> {
    @Override
    void delete(Design deleted);
}

package com.springboot305.springboot_305;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Long> {
}

package com.tehtava.openshift.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.tehtava.openshift.models.Kotityo;

@RepositoryRestResource
@CrossOrigin(origins ="*")
public interface KotityoRepository extends CrudRepository<Kotityo, Long> {

}

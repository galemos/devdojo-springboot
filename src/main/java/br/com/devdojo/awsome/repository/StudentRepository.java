package br.com.devdojo.awsome.repository;

import br.com.devdojo.awsome.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by glemos on 18/06/2018.
 */

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}

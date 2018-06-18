package br.com.devdojo.awsome.endpoint;

/**
 * @author Created by Gabriel Lemos on 13/06/2018.
 */

import br.com.devdojo.awsome.eror.CustomErrorType;
import br.com.devdojo.awsome.model.Student;
import br.com.devdojo.awsome.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentEndpoint {
    private final StudentRepository studentDAO;

    @Autowired
    public StudentEndpoint(StudentRepository studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {
        Optional<Student> student = studentDAO.findById(id);
        if (student.isPresent()){
            return  new ResponseEntity<>(student,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/findbyname/{name}")
    public ResponseEntity<?> findStudentByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(studentDAO.findByNameIgnoreCaseContaining(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentDAO.save(student),HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id) {
        studentDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Student student) {
        studentDAO.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}

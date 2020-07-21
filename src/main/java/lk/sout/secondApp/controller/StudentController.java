package lk.sout.secondApp.controller;

import lk.sout.secondApp.entity.Student;
import lk.sout.secondApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// this is end API
@Controller
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> save(@RequestBody Student student) {
        try {
            return ResponseEntity.ok(studentService.save(student));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        try {
            //  return ResponseEntity.ok(brandService.findAll(PageRequest.of(Integer.parseInt(page), Integer.parseInt(pageSize))));
            return ResponseEntity.ok(studentService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

}

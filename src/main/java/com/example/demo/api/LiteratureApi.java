package com.example.demo.api;

import com.example.demo.domain.AuthorEntity;
import com.example.demo.domain.DepartmentEntity;
import com.example.demo.domain.LiteratureEntity;
import com.example.demo.domain.TeacherEntity;
import com.example.demo.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/literature")
public class LiteratureApi {

    @Autowired
    LiteratureService literatureService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody LiteratureEntity saveLiterature(@RequestBody LiteratureEntity literatureEntity){
        return literatureService.saveLiterature(literatureEntity);
    }

    @RequestMapping(value = "/delete/{literatureId}", method = RequestMethod.DELETE)
    public @ResponseBody Boolean deleteLiiterature(@PathVariable Long literatureId){
        return literatureService.deleteLiterature(literatureId);
    }
    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<LiteratureEntity> getAllTeachers(){
        return literatureService.returnAll();
    }

    @RequestMapping(value = "/returnById/{literatureId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<LiteratureEntity> getTeacher(@PathVariable Long literatureId){
        return literatureService.returnById(literatureId);
    }
}

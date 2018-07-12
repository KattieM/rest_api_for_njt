package com.example.demo.api;

import com.example.demo.domain.DepartmentEntity;
import com.example.demo.domain.TeacherEntity;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/teacher")
public class TeacherApi {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Boolean saveTeacher(@RequestBody TeacherEntity teacherEntity){
        return teacherService.saveTeacher(teacherEntity);
    }

    @RequestMapping(value = "/delete/{teacherId}", method = RequestMethod.DELETE)
    public @ResponseBody Boolean deleteTeacher(@PathVariable Long teacherId){
        return teacherService.deleteTeacher(teacherId);
    }
    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TeacherEntity> getAllTeachers(){
        return teacherService.returnAll();
    }

    @RequestMapping(value = "/returnById/{teacherId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<TeacherEntity> getTeacher(@PathVariable Long teacherId){
        return teacherService.returnById(teacherId);
    }

}

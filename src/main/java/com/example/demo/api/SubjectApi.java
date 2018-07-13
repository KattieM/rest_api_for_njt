package com.example.demo.api;


import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/subject")
public class SubjectApi {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    SubjectEntity saveSubject(@RequestBody SubjectEntity subjectEntity){
        return subjectService.saveSubject(subjectEntity);
    }

//    @RequestMapping(value = "/delete/{subjectId}", method = RequestMethod.DELETE)
//    public @ResponseBody Boolean deleteSubject(@PathVariable  subjectId){
//        return subjectService.deleteSubject(subjectId);
//    }
    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SubjectEntity> getAllTeachers(){
        return subjectService.returnAll();
    }
//    @RequestMapping(value = "/returnById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public Iterable<SubjectModuleSemesterTypeEntity> getTeacher(){
//        return subjectService.returnById();
//    }
}

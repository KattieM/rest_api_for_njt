package com.example.demo.api;


import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeKey;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectModuleSemesterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/subject")
public class SubjectModuleSemesterTypeApi {
    @Autowired
    SubjectModuleSemesterTypeService subjectModuleSemesterTypeService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    SubjectModuleSemesterTypeEntity saveSubject(@RequestBody SubjectDto subjectDto){
        return subjectModuleSemesterTypeService.saveSubject(subjectDto);
    }

//    @RequestMapping(value = "/delete/{subjectId}", method = RequestMethod.DELETE)
//    public @ResponseBody Boolean deleteSubject(@PathVariable  subjectId){
//        return subjectModuleSemesterTypeService.deleteSubject(subjectId);
//    }
    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SubjectModuleSemesterTypeEntity> getAllTeachers(){
        return subjectModuleSemesterTypeService.returnAll();
    }
//    @RequestMapping(value = "/returnById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public Iterable<SubjectModuleSemesterTypeEntity> getTeacher(){
//        return subjectModuleSemesterTypeService.returnById();
//    }
}

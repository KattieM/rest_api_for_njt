package com.example.demo.api;

import com.example.demo.domain.DepartmentEntity;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/department")
public class DepartmentApi {

    @Autowired
    private DepartmentService departmentService;

    /**
     *Save cuva i update-uje, ukoliko je prosledjen ID objekta, ukoliko on vec postoji, azurira ga, ako ne obrise ga
     * delete - brise department po ID-u
     * returnAll - vraca sve departmente
     * returnById - vraca samo jedan department, po ID-u
     *
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity) throws Exception {
        return departmentService.saveDepartment(departmentEntity);
    }
    @RequestMapping(value = "/delete/{departmentId}", method = RequestMethod.DELETE)
    public @ResponseBody Boolean deleteDepartment(@PathVariable Long departmentId) throws Exception {
       return departmentService.deleteDepartment(departmentId);
    }
    @RequestMapping(value = "/returnAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<DepartmentEntity> getAllDepartments(){
        return departmentService.returnAll();
    }
    @RequestMapping(value = "/returnById/{departmentId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<DepartmentEntity> getDepartment(@PathVariable Long departmentId){
        return departmentService.returnById(departmentId);
    }
}

package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "teachersThesis")
public class TeacherThesisFacultyEntity {
    @EmbeddedId
    private TeacherThesisFacultyKey teacherThesisFacultyKey;

    @Column(name = "date_from")
    private Date date_from;

    @Column(name = "present")
    private boolean present;

    @Column(name = "due_date")
    private Date due_date;

    public TeacherThesisFacultyEntity() {
    }

    public TeacherThesisFacultyEntity(TeacherThesisFacultyKey teacherThesisFacultyKey, Date date_from, boolean present) {
        this.teacherThesisFacultyKey = teacherThesisFacultyKey;
        this.date_from = date_from;
        this.present = present;
    }

    public TeacherThesisFacultyEntity(TeacherThesisFacultyKey teacherThesisFacultyKey, Date date_from, Date due_date) {
        this.teacherThesisFacultyKey = teacherThesisFacultyKey;
        this.date_from = date_from;
        this.due_date = due_date;
    }

    public TeacherThesisFacultyKey getTeacherThesisFacultyKey() {
        return teacherThesisFacultyKey;
    }

    public void setTeacherThesisFacultyKey(TeacherThesisFacultyKey teacherThesisFacultyKey) {
        this.teacherThesisFacultyKey = teacherThesisFacultyKey;
    }

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
}

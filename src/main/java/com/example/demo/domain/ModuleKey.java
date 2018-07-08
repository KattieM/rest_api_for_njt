package rest.rest.domain;

import javax.persistence.*;

@Embeddable
public class ModuleKey {
    @ManyToOne
    @JoinColumn(name = "degreeOfStudyID")
    private DegreeOfStudyEntity degreeOfStudyEntity;

    @ManyToOne
    @JoinColumn (name = "studyProgramID")
//    private StudyProgramEntity studyProgramEntity;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    public ModuleKey() {
    }

//    public ModuleKey(DegreeOfStudyEntity degreeOfStudyEntity, StudyProgramEntity studyProgramEntity) {
//        this.degreeOfStudyEntity = degreeOfStudyEntity;
//        this.studyProgramEntity = studyProgramEntity;
//    }

    public DegreeOfStudyEntity getDegreeOfStudyEntity() {
        return degreeOfStudyEntity;
    }

    public void setDegreeOfStudyEntity(DegreeOfStudyEntity degreeOfStudyEntity) {
        this.degreeOfStudyEntity = degreeOfStudyEntity;
    }

//    public StudyProgramEntity getStudyProgramEntity() {
//        return studyProgramEntity;
//    }
//
//    public void setStudyProgramEntity(StudyProgramEntity studyProgramEntity) {
//        this.studyProgramEntity = studyProgramEntity;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

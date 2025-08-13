package org.ex.entity;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "courseTable")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Course Id (PK)

    @NotBlank(message = "Course name is required")

    @Column(name = "courseName", nullable = false)
    private String courseName;

    @NotBlank(message = "Author name is required")
    @Column(name = "authorName", nullable = false)
    private String authorName;

    @NotNull(message = "Duration is required")
    @Min(value = 1, message = "Duration must be >= 1 hour")
    @Column(name = "durationInHours", nullable = false)
    private Integer durationInHours;

    @NotNull(message = "Availability is required")
    @Column(name = "availability", nullable = false)
    private Boolean availability;

    public Course() {     //empty constructor is needed for jpa
    }

    public Course(Long id, String courseName, String authorName, Integer durationInHours, Boolean availability) {
        this.id = id;
        this.courseName = courseName;
        this.authorName = authorName;
        this.durationInHours = durationInHours;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(Integer durationInHours) {
        this.durationInHours = durationInHours;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}



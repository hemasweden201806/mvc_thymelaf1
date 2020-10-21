package se.lexicon.mvc_thymelaf.dto;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class StudentDTO {

    private String name;
    private String email;
    private String course;

    public StudentDTO(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public StudentDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
package com.example.springsecuritymongo.model;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "enrollments")
@Getter
@Setter
@NoArgsConstructor

public class Enrollment {
    @Id
    private String id;
    private String username;
    private String courseCode;

    private double mark=-1;


    public Enrollment(String id, String username, String courseCode, double mark) {
        this.id = id;
        this.username = username;
        this.courseCode = courseCode;
        this.mark = mark;
    }
}

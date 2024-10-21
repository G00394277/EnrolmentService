package ie.atu.enrolmentapp;

import lombok.Data;

@Data
public class Enrolment {
    String enrolmentId;
    String studentId;
    String studentName;
    String courseCode;
    String enrolmentDate;
}

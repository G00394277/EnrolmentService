package ie.atu.enrolmentapp;

import jakarta.validation.Valid;
import org.springframework.data.web.ReactiveOffsetScrollPositionHandlerMethodArgumentResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/enrolments")
public class EnrolmentController {
    private final EnrolmentRepository enrolmentRepository;


    public EnrolmentController(EnrolmentRepository enrolmentRepository) {
        this.enrolmentRepository = enrolmentRepository;
    }

    @PostMapping
    public ResponseEntity<Enrolment> CreateEnrolment(@Valid @RequestBody Enrolment enrolment){
        Enrolment savedEnrolment = EnrolmentRepository.Save(Enrolment);

        public ResponseEntity<StudentService.Student> findById(@PathVariable String id){
            Optional<Student> StudentRepository.findById(id);
            if(Student.isPresent()){
                Student.setStudent
            }
            else{
                return (ResponseEntity<Enrolment>) ResponseEntity.notFound();
            }
        }

        return null;
    }
}

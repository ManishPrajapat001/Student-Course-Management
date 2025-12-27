package Service;

import Entity.Student;
import Repositories.StudentManagementRepository;
import Exception.EntityNotFoundException;
import Utils.IdGenerator;

public class StudentManagementService {
    public static Student searchStudentByID(Integer id) throws EntityNotFoundException {

        Student student =  StudentManagementRepository.searchStudentByID(id);

        if(student == null){
            throw new EntityNotFoundException("Student not Found");
        }

        return student;

    }
}

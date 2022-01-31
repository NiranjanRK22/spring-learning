package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	private IStudentRepository studentRepository;
	
	@Autowired
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);

	}

	@Override
	public Student getById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<Student> getByDeptAndCity(String dept, String city) {
		return studentRepository.findByDeptAndCity(dept, city);
	}

	@Override
	public List<Student> getByState(String state) {
		return studentRepository.findByState(state);
	}

	@Override
	public List<Student> getByDepartment(String department) {
		return studentRepository.findByDepartment(department);
	}

	

}

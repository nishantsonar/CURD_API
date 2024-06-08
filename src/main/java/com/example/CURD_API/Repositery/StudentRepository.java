/* Author @ Nishant Suresh Sonar 
created on 08/06/24 
inside the package - com.example.CURD_API.Repositery */
package com.example.CURD_API.Repositery;

import com.example.CURD_API.Entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


package dev.pioruocco.springbatchapplication.reposiitory;

import dev.pioruocco.springbatchapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

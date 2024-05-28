package dev.pioruocco.springbatchapplication.processor;

import dev.pioruocco.springbatchapplication.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student item) throws Exception {

        //busness logic di processor
        return item;
    }
}

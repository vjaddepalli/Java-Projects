package com.zensar.training.ui;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main3 {

	public static void main(String[] args) {

		List<Student> students = CollectionFactory.getStudentList();

		Stream<Student> stdStream = students.stream();

//		stdStream.sorted(new StudentMarkComparator()).filter((s) -> s.getAverageMark() > 80.0).forEach((s) -> {
//			System.out.println(s.getRollNo() + "\t" + s.getName() + "\t" + s.getAverageMark());
//		});

//		DoubleStream ds = stdStream.mapToDouble((s) -> s.getAverageMark());
//		OptionalDouble od = ds.max();
//		if (od.isPresent())
//			System.out.println(od.getAsDouble());

//		Optional<Student> minStudent = stdStream.min(new StudentMarkComparator());
//		if (minStudent.isPresent())
//			System.out.println(minStudent.get());
		
//		Optional<Student> maxStudent = stdStream.max(new StudentMarkComparator());
//		if (maxStudent.isPresent())
//			System.out.println(maxStudent.get());
		
//		Optional<Student> optionalStud=stdStream.findAny();
//		if(optionalStud.isPresent())
//			System.out.println(optionalStud.get());
		
//		boolean result = stdStream.allMatch((s) ->s.getAverageMark()>80 );
//		System.out.println(result);
		
//		boolean result = stdStream.anyMatch((s) ->s.getAverageMark()>80 );
//		System.out.println(result);
		
//		Optional<Student> std=stdStream.findAny();
//		if(std.isPresent())
//			System.out.println(std.get());
		
		
//		Optional<Student> std2=stdStream.findFirst();
//		if(std2.isPresent())
//			System.out.println(std2.get());
		
		List<Student> list = stdStream.filter((s)->s.getDepartment().equalsIgnoreCase("ECE")).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		

	}

}

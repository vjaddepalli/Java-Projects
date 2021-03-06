package com.zensar.training.ui;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main2 {

	public static void main(String[] args) {
		
		DoubleStream ds1=DoubleStream.of(16.0,22.0,7.0);
		// sum, min, max, average, count
		
		double total=ds1.sum();
		System.out.println(total);
		
		DoubleStream ds2=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble=ds2.max();
		if(optionalDouble.isPresent())
			System.out.println(optionalDouble.getAsDouble());
		else
			System.out.println("Source Empty");
		
		DoubleStream ds3=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble1=ds3.min();
		if(optionalDouble1.isPresent())
			System.out.println(optionalDouble1.getAsDouble());
		else
			System.out.println("Source Empty");
		
		DoubleStream ds4=DoubleStream.of(16.0,22.0,7.0);
		OptionalDouble optionalDouble2=ds4.average();
		if(optionalDouble2.isPresent())
			System.out.println(optionalDouble2.getAsDouble());
		else
			System.out.println("Source Empty");
		
		DoubleStream ds5=DoubleStream.of(16.0,22.0,7.0);
		long count=ds5.count();
		System.out.println(count);
		
		DoubleStream ds6=DoubleStream.of(16.0,22.0,7.0);
		ds6.forEach((d)->System.out.println(d));
		
		DoubleStream ds7=DoubleStream.of(16.0,22.0,7.0);
		ds7.filter((d)->15<d).forEach((d)->System.out.println(d));
		
		
		

	}

}

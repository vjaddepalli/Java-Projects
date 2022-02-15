package com.zensar.training.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface StorageMedium {
	
	Storage medium();

}

package com.coding.thoughtworks.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.coding.thoughtworks.Validator.PhoneConstraintValidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy=PhoneConstraintValidator.class)
public @interface Phone {
	String message() default "Phone";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}

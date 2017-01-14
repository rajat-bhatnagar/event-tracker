package com.coding.thoughtworks.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.coding.thoughtworks.Annotation.Phone;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String>{
	
	public void initialize(Phone phone) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isValid(String phoneField, ConstraintValidatorContext context) {
		if(StringUtils.isEmpty(phoneField)){
			return false;
		}
		/*
		 * Use a Regular expression to check the valid-ity of our phone field
		 */
		return phoneField.matches("[0-9()-]*");
	}

}

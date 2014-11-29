package ro.andonescu.demos.springfreemarker.util;

import org.joda.time.DateTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;

public class AgeVerificationValidator implements
        ConstraintValidator<AgeVerification, Date> {

    private Integer minAge;

    public void initialize(AgeVerification constraintAnnotation) {
        this.minAge = constraintAnnotation.minAge();

    }

    public boolean isValid(Date value, ConstraintValidatorContext context) {
        return value == null || value != null && new DateTime(value.getTime()).plusYears(minAge).isBeforeNow();
    }

}

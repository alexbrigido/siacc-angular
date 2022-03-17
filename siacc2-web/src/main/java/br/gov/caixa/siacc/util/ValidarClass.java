package br.gov.caixa.siacc.util;

import java.util.Set;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

public class ValidarClass<R> {
	@Inject
	private Validator validator;

	public  Set<ConstraintViolation<R>> validate(R o) throws Exception {
		Set<ConstraintViolation<R>> violations = validator.validate(o);

		return violations;
	}
}

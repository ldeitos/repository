package com.github.ldeitos.tarcius.audit.resolver;

import static com.github.ldeitos.tarcius.configuration.Constants.FORMATTED_DATE_RESOLVER_ID;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;

import com.github.ldeitos.tarcius.api.ParameterResolver;
import com.github.ldeitos.tarcius.qualifier.CustomResolver;

/**
 * Default implementation to {@link ParameterResolver} to apply format to
 * {@link Date} values.
 *
 * @author <a href=mailto:leandro.deitos@gmail.com>Leandro Deitos</a>
 *
 */
@ApplicationScoped
@CustomResolver(FORMATTED_DATE_RESOLVER_ID)
public class DefaultFormattedDateStringResolver extends FormattedStringResolver<Date> {

	@Override
	public String resolve(Date input) {
		DateFormat formatter = new SimpleDateFormat(getFormat());
		return formatter.format(input);
	}

}
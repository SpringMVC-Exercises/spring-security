package net.codejava.spring;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 *Spring Security Filter.
 *
 * @author www.codejava.net
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfig.class);
	}

}
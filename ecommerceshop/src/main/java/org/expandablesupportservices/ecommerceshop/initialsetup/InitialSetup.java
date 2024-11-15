package org.expandablesupportservices.ecommerceshop.initialsetup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class InitialSetup {

	
    @Autowired
    private Environment env;
	
	 	@PostConstruct
	    public void init() {
	    
	    }
	
}

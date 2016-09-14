package com.travelport;

import com.travelport.resources.MessageResource;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Dropwizard application
 * Used to add bundles and register REST resources
 */
public class MessageApplication extends Application<MessageConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MessageApplication().run(args);
    }

    @Override
    public String getName() {
        return "Message";
    }

    @Override
    public void initialize(final Bootstrap<MessageConfiguration> bootstrap) {
    	// add assets bundle to serve static content from dropwizard
    	bootstrap.addBundle(new AssetsBundle("/assets/", "/assets/"));
    }

    @Override
    public void run(final MessageConfiguration configuration,
                    final Environment environment) {
    	
    	// Register Message Resource
        final MessageResource msgResource = new MessageResource();
        environment.jersey().register(msgResource);
    }

}

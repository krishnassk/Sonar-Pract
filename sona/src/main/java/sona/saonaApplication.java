package sona;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class saonaApplication extends Application<saonaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new saonaApplication().run(args);
    }

    @Override
    public String getName() {
        return "saona";
    }

    @Override
    public void initialize(final Bootstrap<saonaConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final saonaConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

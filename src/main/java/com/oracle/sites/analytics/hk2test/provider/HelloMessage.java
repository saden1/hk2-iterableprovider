package com.oracle.sites.analytics.hk2test.provider;

import com.oracle.sites.analytics.hk2test.MessageProvider;
import javax.inject.Named;
import org.jvnet.hk2.annotations.ContractsProvided;
import org.jvnet.hk2.annotations.Service;

/**
 *
 * @author saden
 */
@Named
@Service
@ContractsProvided(MessageProvider.class)
public class HelloMessage implements MessageProvider {

    public String get() {
        return "Hello";
    }

}

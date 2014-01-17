package com.oracle.sites.analytics.hk2test.provider;

import com.oracle.sites.analytics.hk2test.MessageProvider;
import java.lang.reflect.Method;
import javax.inject.Inject;
import javax.inject.Named;
import org.glassfish.hk2.api.ServiceLocator;
import org.jvnet.testing.hk2testng.HK2;
import org.testng.annotations.Test;

/**
 *
 * @author saden
 */
@HK2
public class WorldMessageTest {

    @Named("WorldMessage")
    @Inject
    MessageProvider messageProvider;
    @Inject
    ServiceLocator locator;

    @Test
    public void test(Method method) {
        System.out.println("Running: " + method.getDeclaringClass().getSimpleName());
        System.out.println("Locator: " + locator);
        System.out.println("Message: " + messageProvider.get());
    }

}

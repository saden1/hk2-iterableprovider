package com.oracle.sites.analytics.hk2test;

import java.lang.reflect.Method;
import javax.inject.Inject;
import org.glassfish.hk2.api.IterableProvider;
import org.glassfish.hk2.api.ServiceLocator;
import org.jvnet.testing.hk2testng.HK2;
import org.testng.annotations.Test;

/**
 *
 * @author saden
 */
@HK2
public class MessageProviderTest {

    @Inject
    IterableProvider<MessageProvider> messageProviders;
    @Inject
    ServiceLocator locator;

    @Test
    public void test(Method method) {
        System.out.println("Running: " + method.getDeclaringClass().getSimpleName());
        System.out.println("Locator: " + locator);

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (MessageProvider messageProvider : messageProviders) {
            sb.append(messageProvider.get());
            sb.append(" ");
            count++;
        }

        System.out.println("Aggregated Message: " + sb);
        System.err.println("Expecting 2 MessageProviders but got: " + count);

    }

}

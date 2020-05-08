package net.togogo;

import net.togogo.dynamicproxy.CglibProxyFactory;
import net.togogo.impl.CjlibImpl;
import org.junit.Test;

public class CjlibTest {

    @Test
    public void save(){
        CjlibImpl proxy = (CjlibImpl) new CglibProxyFactory().getProxy(CjlibImpl.class);
        proxy.sava("前妹妹");
    }

}

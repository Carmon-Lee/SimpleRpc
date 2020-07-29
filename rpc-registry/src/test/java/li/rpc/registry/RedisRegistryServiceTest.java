package li.rpc.registry;

import li.rpc.common.RpcBus;
import li.rpc.registry.config.RegistryConfig;
import org.junit.Test;

import java.util.Arrays;


class RedisRegistryServiceTest {

    @Test
    void register() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setHost("localhost");
        registryConfig.setPort(6379);
        RedisRegistryService registryService = new RedisRegistryService(registryConfig);

        RpcBus rpcBus = new RpcBus();
        rpcBus.setServiceName("li.rpc.EchoService");
        rpcBus.setMethods(Arrays.asList("method1","method2"));
        registryService.register(rpcBus);

        registryService.unregister(rpcBus);
    }


}
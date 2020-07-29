package li.rpc.registry;

import li.rpc.common.RpcBus;
import li.rpc.registry.config.RegistryConfig;
import redis.clients.jedis.Jedis;

public class RedisRegistryService implements RegistryService {

    private RegistryConfig registryConfig;
    private Jedis jedis;

    public RedisRegistryService(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        init();
    }

    private void init() {
        this.jedis = new Jedis(registryConfig.getHost(),
                registryConfig.getPort());
    }

    public void register(RpcBus bus) {
        jedis.lpush("service", bus.getServiceName());
    }


    public void unregister(RpcBus bus) {
        jedis.lrem("service", 0, bus.getServiceName());
    }
}

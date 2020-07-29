package li.rpc.registry;

import li.rpc.common.RpcBus;

public interface RegistryService {

    void register(RpcBus bus);

    void unregister(RpcBus bus);
}

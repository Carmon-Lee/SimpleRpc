package li.rpc.registry.config;

import lombok.Data;

import java.util.List;

@Data
public class RegistryConfig {

    private String protocol;
    private String host;
    private int port;
}

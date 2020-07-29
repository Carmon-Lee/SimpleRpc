package li.rpc.common;

import lombok.Data;

import java.util.List;

@Data
public class RpcBus {

    private String host;
    private int port;
    private String serviceName;
    private List<String> methods;


}

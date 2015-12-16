package com.github.openwebnet.model;

import static java.util.Objects.requireNonNull;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class GatewayModel extends RealmObject implements RealmModel {

    @PrimaryKey
    private String uuid;

    @Required
    private String host;

    @Required
    private Integer port;

    public static GatewayModel newGateway(String host, Integer port) {
        requireNonNull(host, "host is null");
        requireNonNull(port, "port is null");

        GatewayModel gateway = new GatewayModel();
        gateway.setUuid(UUID.randomUUID().toString());
        gateway.setHost(host);
        gateway.setPort(port);
        return gateway;
    }

    @Override
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}

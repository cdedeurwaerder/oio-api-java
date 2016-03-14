package io.openio.sds.http;

import io.openio.sds.settings.PoolingSettings;

/**
 * 
 * @author Christopher Dedeurwaerder
 *
 */
public class OioHttpSettings {

    private Integer sendBufferSize = 8192;
    private Integer receiveBufferSize = 8192;
    private Integer connectTimeout = 30000;
    private Integer readTimeout = 60000;
    private PoolingSettings pooling = new PoolingSettings();

    public OioHttpSettings() {
    }

    public Integer sendBufferSize() {
        return sendBufferSize;
    }

    public OioHttpSettings sendBufferSize(Integer sendBufferSize) {
        this.sendBufferSize = sendBufferSize;
        return this;
    }

    public Integer receiveBufferSize() {
        return receiveBufferSize;
    }

    public OioHttpSettings receiveBufferSize(Integer receiveBufferSize) {
        this.receiveBufferSize = receiveBufferSize;
        return this;
    }

    public Integer connectTimeout() {
        return connectTimeout;
    }

    public OioHttpSettings connectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    public Integer readTimeout() {
        return readTimeout;
    }

    public OioHttpSettings readTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    public PoolingSettings pooling() {
        return pooling;
    }

    public OioHttpSettings pooling(PoolingSettings pooling) {
        this.pooling = pooling;
        return this;
    }
}

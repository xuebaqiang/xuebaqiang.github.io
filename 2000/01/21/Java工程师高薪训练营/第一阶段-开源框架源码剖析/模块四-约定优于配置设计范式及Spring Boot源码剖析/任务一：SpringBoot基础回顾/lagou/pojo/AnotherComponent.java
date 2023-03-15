package com.lagou.pojo;

import java.net.InetAddress;


public class AnotherComponent {

    // 是否启用
    private Boolean enabled;

    // IP地址
    private InetAddress remoteAddress;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(InetAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public String toString() {
        return "AnotherComponent{" +
                "enabled=" + enabled +
                ", remoteAddress=" + remoteAddress +
                '}';
    }
}

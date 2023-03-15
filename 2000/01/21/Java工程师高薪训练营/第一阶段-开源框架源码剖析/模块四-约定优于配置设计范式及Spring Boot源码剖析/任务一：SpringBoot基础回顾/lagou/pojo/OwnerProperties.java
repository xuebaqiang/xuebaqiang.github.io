package com.lagou.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("acme.my-person.person")
public class OwnerProperties {

    public String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "OwnerProperties{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}

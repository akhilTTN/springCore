package com.spring.demo;

/**
 * Created by akhil on 28/3/17.
 */
public class Database {
    String port;
    String name;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "port='" + port + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.stackers.storage.model;

public class RobotEmulator {
    private int id;
    private String name;
    private String ip;
    private int port;

    public RobotEmulator() {
    }

    public RobotEmulator(int id, String name, String ip, int port) {
        this.id = id;
        this.name = name;
        this.ip = ip;
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }
}

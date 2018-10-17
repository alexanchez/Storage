package com.stackers.storage.model;

public class ClientResponse {
    private int id;
    private int id_client;
    private String robotName;
    private String source;
    private String target;
    //private Priority priority;
    private String container_code;

    public ClientResponse() {
    }

    public ClientResponse(int id, int id_client, String robotName, String source, String target, String container_code) {
        this.id = id;
        this.id_client = id_client;
        this.robotName = robotName;
        this.source = source;
        this.target = target;
        this.container_code = container_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getContainer_code() {
        return container_code;
    }

    public void setContainer_code(String container_code) {
        this.container_code = container_code;
    }
}

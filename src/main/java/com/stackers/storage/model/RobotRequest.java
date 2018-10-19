package com.stackers.storage.model;

public class RobotRequest {
    private String id;
    private RobotCommand robotCommand;
    private String idCell; //Must be object in the future
    private Direction direction;
    private int robotId;

    public RobotRequest() {
    }

    public RobotRequest(String id, RobotCommand robotCommand, String idCell, Direction direction, int robotId) {
        this.id = id;
        this.robotCommand = robotCommand;
        this.idCell = idCell;
        this.direction = direction;
        this.robotId = robotId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RobotCommand getRobotCommand() {
        return robotCommand;
    }

    public void setRobotCommand(RobotCommand robotCommand) {
        this.robotCommand = robotCommand;
    }

    public String getIdCell() {
        return idCell;
    }

    public void setIdCell(String idCell) {
        this.idCell = idCell;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }
}

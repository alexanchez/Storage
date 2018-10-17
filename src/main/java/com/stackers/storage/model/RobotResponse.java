package com.stackers.storage.model;

import com.stackers.storage.CommandState;
import com.stackers.storage.RobotPlat;
import com.stackers.storage.RobotState;

public class RobotResponse {
    private int id;
    private RobotState robotState;
    private RobotPlat robotPlat;
    private int section; //Must be collection in the future
    private RobotRequest robotRequest;//!!!!
    private CommandState commandState;
    private int cmd_fault;   //0 | cmd_fault_code
    private int robot_fault; //0 | robot_fault_code


    public RobotResponse() {
    }

    public RobotResponse(int id, RobotState robotState, RobotPlat robotPlat, int section, RobotRequest robotRequest, CommandState commandState, int cmd_fault, int robot_fault) {
        this.id = id;
        this.robotState = robotState;
        this.robotPlat = robotPlat;
        this.section = section;
        this.robotRequest = robotRequest;
        this.commandState = commandState;
        this.cmd_fault = cmd_fault;
        this.robot_fault = robot_fault;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RobotState getRobotState() {
        return robotState;
    }

    public void setRobotState(RobotState robotState) {
        this.robotState = robotState;
    }

    public RobotPlat getRobotPlat() {
        return robotPlat;
    }

    public void setRobotPlat(RobotPlat robotPlat) {
        this.robotPlat = robotPlat;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public RobotRequest getRobotRequest() {
        return robotRequest;
    }

    public void setRobotRequest(RobotRequest robotRequest) {
        this.robotRequest = robotRequest;
    }

    public CommandState getCommandState() {
        return commandState;
    }

    public void setCommandState(CommandState commandState) {
        this.commandState = commandState;
    }

    public int getCmd_fault() {
        return cmd_fault;
    }

    public void setCmd_fault(int cmd_fault) {
        this.cmd_fault = cmd_fault;
    }

    public int getRobot_fault() {
        return robot_fault;
    }

    public void setRobot_fault(int robot_fault) {
        this.robot_fault = robot_fault;
    }
}

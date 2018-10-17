package com.stackers.storage.model;

import com.stackers.storage.RobotCommand;

public class RobotRequest {
    private String id;
    private RobotCommand robotCommand;
    private String idCell; //Must be object in the future
    private Direction direction;
}

package com.stackers.storage.service.robotEmulator.interfaces;

import com.stackers.storage.model.RobotRequest;
import com.stackers.storage.model.RobotResponse;

public interface IRobotEmulatorService {
    String sendRequestToRobot(RobotRequest robotRequest,int robotEmulatorId);
    String getRequest(String requestString,int robotId);
    RobotResponse operateRequest(RobotRequest robotRequest);
    RobotResponse sendRequestToServer(RobotResponse robotResponse);
    String getResponseFromRobot(RobotResponse robotResponse,int robotId);
}

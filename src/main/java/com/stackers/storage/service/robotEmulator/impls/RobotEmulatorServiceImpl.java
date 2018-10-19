package com.stackers.storage.service.robotEmulator.impls;

import com.stackers.storage.model.RobotEmulator;
import com.stackers.storage.model.RobotRequest;
import com.stackers.storage.model.RobotResponse;
import com.stackers.storage.service.robotEmulator.interfaces.IRobotEmulatorService;
import org.springframework.stereotype.Service;

@Service
public class RobotEmulatorServiceImpl implements IRobotEmulatorService {
    private RobotEmulator robot1 = new RobotEmulator(1,"Blue","127.0.0.1",9090);

    @Override
    public String sendRequestToRobot(RobotRequest robotRequest, int robotEmulatorId) {
        return null;
    }

    @Override
    public String getRequest(String requestString, int robotId){
        return null;
    }

    @Override
    public RobotResponse operateRequest(RobotRequest robotRequest) {
        return null;
    }

    @Override
    public RobotResponse sendRequestToServer(RobotResponse robotResponse) {
        return null;
    }

    @Override
    public String getResponseFromRobot(RobotResponse robotResponse, int robotId) {
        return null;
    }

    public RobotEmulator getRobot1() {
        return robot1;
    }
}

package com.stackers.storage.service.request.impls;

import com.stackers.storage.model.*;
import com.stackers.storage.service.request.interfaces.IResponseService;
import com.stackers.storage.service.robotEmulator.impls.RobotEmulatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.net.*;
import java.io.*;

import java.awt.*;

@Service

public class ResponseServiceImpl implements IResponseService {
    @Autowired
    RobotEmulatorServiceImpl robotEmulatorService;

    @Override
    public ClientResponse getResponse(ClientRequest clientRequest) {
        return null;
    }

    @Override
    public ClientResponse getResponse(ClientCommand clientCommand, String cellId) {
//        return new ClientResponse(1,2,"firstRobot",cellId,"001L002","101");
        //choose robot by logic
        RobotEmulator robot = robotEmulatorService.getRobot1();
        RobotRequest robotRequest = new RobotRequest();
//        robotRequest.setId();
        robotRequest.setDirection(Direction.CW);
        robotRequest.setRobotCommand(RobotCommand.GO);
        robotRequest.setRobotId(robot.getId());
        robotRequest.setIdCell(cellId);
        RobotResponse robotResponse = this.sendRequestToRobot(robotRequest);



        ClientResponse clientResponse = new ClientResponse();
        if(robotResponse.getRobotState().equals(RobotState.READY))
        {
            clientResponse.setRobotName(robot.getName());
            clientResponse.setId_client(1);
            clientResponse.setId(1);
            clientResponse.setSource(this.getSource(clientCommand, cellId));
            clientResponse.setTarget(this.getSource(clientCommand, cellId));
            clientResponse.setContainer_code("00123f43");
        }
        return clientResponse;
    }
    private RobotResponse sendRequestToRobot(RobotRequest robotRequest){

        return null;
    };

    private String getSource(ClientCommand clientCommand, String cellId){
        return "001L025";
    }
    private String getTarget(ClientCommand clientCommand, String cellId){
        return "001L030";
    }
}

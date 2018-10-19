package com.stackers.storage.service.request.interfaces;

import com.stackers.storage.model.ClientCommand;
import com.stackers.storage.model.ClientRequest;
import com.stackers.storage.model.ClientResponse;
import com.stackers.storage.model.RobotResponse;

public interface IResponseService {
    ClientResponse getResponse(ClientRequest clientRequest);
    ClientResponse getResponse(ClientCommand clientCommand, String cellId);

}

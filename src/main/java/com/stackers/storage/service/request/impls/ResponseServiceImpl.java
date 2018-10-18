package com.stackers.storage.service.request.impls;

import com.stackers.storage.model.ClientCommand;
import com.stackers.storage.model.ClientRequest;
import com.stackers.storage.model.ClientResponse;
import com.stackers.storage.service.request.interfaces.IResponseService;
import org.springframework.stereotype.Service;

@Service

public class ResponseServiceImpl implements IResponseService {
    @Override
    public ClientResponse getResponse(ClientRequest clientRequest) {
        return null;
    }

    @Override
    public ClientResponse getResponse(ClientCommand clientCommand, String cellId) {
        return new ClientResponse(1,2,"firstRobot",cellId,"001L002","101");
    }
}

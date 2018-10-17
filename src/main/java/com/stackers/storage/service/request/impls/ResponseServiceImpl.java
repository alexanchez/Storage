package com.stackers.storage.service.request.impls;

import com.stackers.storage.Command;
import com.stackers.storage.model.Request;
import com.stackers.storage.model.Response;
import com.stackers.storage.service.request.interfaces.IResponseService;
import org.springframework.stereotype.Service;

@Service

public class ResponseServiceImpl implements IResponseService {
    @Override
    public Response getResponse(Request request) {
        return null;
    }

    @Override
    public Response getResponse(Command command, String cellId) {
        return new Response(1,2,"firstRobot",cellId,"001L002","101");
    }
}

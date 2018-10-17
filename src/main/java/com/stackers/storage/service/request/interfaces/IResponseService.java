package com.stackers.storage.service.request.interfaces;

import com.stackers.storage.Command;
import com.stackers.storage.model.Request;
import com.stackers.storage.model.Response;

public interface IResponseService {
    Response getResponse(Request request);
    Response getResponse(Command command, String cellId);

}

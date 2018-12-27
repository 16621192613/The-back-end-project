package com.hsk.xframe.api.im.api.impl;

import com.hsk.xframe.api.im.api.SendMessageAPI;
import com.hsk.xframe.api.im.comm.EasemobAPI;
import com.hsk.xframe.api.im.comm.OrgInfo;
import com.hsk.xframe.api.im.comm.ResponseHandler;
import com.hsk.xframe.api.im.comm.TokenUtil;

import io.swagger.client.ApiException;
import io.swagger.client.api.MessagesApi;
import io.swagger.client.model.Msg;

public class EasemobSendMessage implements SendMessageAPI {
    private ResponseHandler responseHandler = new ResponseHandler();
    private MessagesApi api = new MessagesApi();
    @Override
    public Object sendMessage(final Object payload) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameMessagesPost(OrgInfo.ORG_NAME,OrgInfo.APP_NAME,TokenUtil.getAccessToken(), (Msg) payload);
            }
        });
    }
}

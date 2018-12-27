package com.hsk.xframe.api.im.comm;

import java.util.concurrent.TimeUnit;

import io.swagger.client.ApiException;

/**
 * Created by easemob on 2017/3/16.
 */
public class ResponseHandler {

    public Object handle(EasemobAPI easemobAPI) {
        Object result = null;
        try {
            result = easemobAPI.invokeEasemobAPI();
        } catch (ApiException e) {
            if (e.getCode() == 401) {
                TokenUtil.initTokenByProp();
                try {
                    result = easemobAPI.invokeEasemobAPI();
                } catch (ApiException e1) {
                    e1.getMessage();
                }
                return result;
            }
            if (e.getCode() == 429) {
            }
            if (e.getCode() >= 500) {
                result = retry(easemobAPI);
                if (result != null) {
                    return result;
                }
                System.out.println(e);
            }
        }
        return result;
    }

    public Object retry(EasemobAPI easemobAPI) {
        Object result = null;
        long time = 5;
        for (int i = 0; i < 3; i++) {
            try {
                TimeUnit.SECONDS.sleep(time);
                result = easemobAPI.invokeEasemobAPI();
                if (result != null) {
                    return result;
                }
            } catch (ApiException e1) {
                time *= 3;
            } catch (InterruptedException e1) {
                e1.getMessage();
            }
        }
        return result;
    }
}

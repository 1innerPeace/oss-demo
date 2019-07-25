package com.play;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取视频播放凭证
 * @throws Exception
 */

public class testGetVideoPlayAuth  {

    /**
     * 获取视频播放凭证
     * @throws Exception
     */
    @Test
    public void testGetVideoPlayAuth() throws Exception {
        // 接口私有参数列表, 不同API请替换相应参数
        Map<String, String> privateParams = new HashMap<String, String>();
        // 视频ID
        privateParams.put("VideoId","0bf7e9f001cb4f8ea42b1d96d61536fa");
        // API名称
        privateParams.put("Action", "GetVideoPlayAuth");

        //生成公共参数，不需要修改
        Map<String, String> publicParams = AliyunVodAPIUtils.generatePublicParamters();
        //生成OpenAPI地址，不需要修改
        String URL = AliyunVodAPIUtils.generateOpenAPIURL(publicParams, privateParams);
        //发送HTTP GET 请求
        AliyunVodAPIUtils.httpGet(URL);
    }

}

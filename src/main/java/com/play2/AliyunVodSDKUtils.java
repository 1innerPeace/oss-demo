package com.play2;

import com.aliyun.oss.ClientException;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.profile.DefaultProfile;

public class AliyunVodSDKUtils {

    //账号AccessKey信息请填写(必选)
    private static String access_key_id = "LTAItQ4XOntVQFpr";
    //账号AccessKey信息请填写(必选)
    private static String access_key_secret = "YhAoUEFy1HdgKvfkRoz0VCwlQz5NUI";
    //STS临时授权方式访问时该参数为必选，使用主账号AccessKey和RAM子账号AccessKey不需要填写
    private static String security_token = "";

    public static DefaultAcsClient initVodClient(String accessKeyId, String accessKeySecret) throws ClientException {
        String regionId = "cn-shanghai";  // 点播服务接入区域
        DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);
        return client;
    }
}

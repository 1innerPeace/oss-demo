package com.test.oss;


import com.aliyun.oss.OSSClient;
import org.junit.Test;

public class OssDemo {

    @Test
    public void test(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAItQ4XOntVQFpr";
        String accessKeySecret = "YhAoUEFy1HdgKvfkRoz0VCwlQz5NUI";
        String bucketName = "atcrowdfundin";

// 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 创建存储空间。
        ossClient.createBucket(bucketName);

// 关闭OSSClient。
        ossClient.shutdown();

    }
//............
}

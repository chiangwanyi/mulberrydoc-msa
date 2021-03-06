package com.cqwu.jwy.mulberrydoc.auth.serializer;


import com.cqwu.jwy.mulberrydoc.auth.pojo.User;
import com.cqwu.jwy.mulberrydoc.common.util.DateUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户序列化器
 */
public final class UserSerializer
{
    private UserSerializer()
    {
    }

    /**
     * 生成用户序列化数据
     *
     * @param user 用户对象
     * @return 用户序列获数据
     */
    public static Map<String, Object> serialData(User user)
    {
        Map<String, Object> data = new HashMap<>();
        data.put("id", user.getId());
        data.put("username", user.getUsername());
        data.put("avatar", user.getAvatar());
        data.put("createdAt", user.getCreatedAt());
        return data;
    }
}

package com.ywz.rediManage;

import redis.clients.jedis.Jedis;

public class RedisDao {
    public static Jedis jedis;
    public RedisDao() {
        if(this.jedis==null){
            try {
                jedis = new Jedis("localhost", 6379);
            }catch (Exception e){
                e.printStackTrace();
            }

            //权限认证

        }
    }

    public void set(String key,String value){
        jedis.set(key,value);
    }

    public String get(String key){
        return jedis.get(key);
    }
}

package com.kws.lostarkhelper.lostarkapi.url;

import java.util.HashMap;
import java.util.Map;

public class LostArkUrlBuilder <T extends Enum<T> & LostArkUrl >{

    private final T apiUrl;
    private final Map<String, Object> params = new HashMap<>();

    public LostArkUrlBuilder(T apiUrl) {
        this.apiUrl = apiUrl;
    }

    public LostArkUrlBuilder<T> param(String key, Object value){
        params.put(key, value);
        return this;
    }

    public String build(){
        String url = apiUrl.url();
        for(Map.Entry<String, Object> entry : params.entrySet()){
            url = url.replace("{" + entry.getKey() + "}", entry.getValue().toString());
        }
        return url;
    }
}

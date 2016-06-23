package com.example.jiashuaowei.core;

/**
 * Action的处理结果回调监听器
 * Created by jiashuaowei on 6/23/16.
 */

public interface ActionCallbackListener<T> {
    public void onSuccess(T data);
    public void onFailure(String errorEvent);
}

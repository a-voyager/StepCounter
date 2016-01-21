package com.voyager.stepcounter;

/**
 * Created by wuhaojie on 2016/1/21.
 */
public interface Listener {
    /**
     * 加速度改变
     */
    void AccChanged();

    /**
     * 方向改变
     */
    void OriChanged();

    /**
     * 陀螺仪改变
     */
    void GyroChanged();
}

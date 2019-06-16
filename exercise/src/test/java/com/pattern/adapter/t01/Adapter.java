package com.pattern.adapter.t01;

public class Adapter implements ThreePlug
{
    
    private TwoPlug twoPlug;
    
    //创建适配器地时候，需要把双插设备接入进来
    public Adapter(TwoPlug twoPlug)
    {
        this.twoPlug = twoPlug;
    }
    
    @Override
    public void electrify(int f, int z, int e)
    {
        twoPlug.electrify(f, z);
    }
    
}

package com.pattern.adapter.t01;

public class TV implements TwoPlug
{
    
    @Override
    public void electrify(int f, int z)
    {
        System.out.println("火线通电："+ f);
        System.out.println("零线通电："+ z);
    }
    
}

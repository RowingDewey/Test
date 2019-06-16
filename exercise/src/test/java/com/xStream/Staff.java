package com.xStream;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("kfpt_staffs")
public class Staff {
	private String name;
    private int age;

    public Staff() {
        super();
    }

    public Staff(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Staff [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append("]");
    
        return builder.toString();
    }
}

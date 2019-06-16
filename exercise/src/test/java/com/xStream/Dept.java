package com.xStream;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("kfpt_dept") //注意这个，后面变成了<kfpt__dept>  下划线。。。。
public class Dept {
	private String deptName;

    private List<Staff> staffs;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
    	 StringBuilder builder = new StringBuilder();
         builder.append("Staff [deptName=");
         builder.append(deptName);
         builder.append(", staffs=");
         builder.append(staffs);
         builder.append("]");
     
         return builder.toString();
    }
}

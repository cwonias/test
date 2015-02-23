package com.test;

public enum TestEnum {
    Test1("t1"),
    Test2("t2");
    private String value;
    
    private TestEnum(String val){
        this.value = val;
		//Change in master 1.
		//Change in master 2.
		//Change in Branch_1 1.
		//Change in Branch_1 2.
    }
    
    public String getValue(){
    	return value;
    }
}

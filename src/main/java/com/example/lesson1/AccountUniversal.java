package com.example.lesson1;

public class AccountUniversal {
    private Object count;
    private Long countLong;

    public AccountUniversal(Object count) {
        if(count instanceof Integer){
            this.count = (Integer) count;
        }
    }

    public Object getCount() {
        return count;
    }

    public void setCount(Object count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void addCount(Object count){
        if(count instanceof Integer){
            count = (Integer)count;
        }
        if(count instanceof  Long){
            countLong += (Long) count;
        }
    }
}

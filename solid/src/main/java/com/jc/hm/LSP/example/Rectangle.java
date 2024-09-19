package com.jc.hm.LSP.example;

public class Rectangle extends Shape {
    @Override
    public int getWidth() {
        return mWidth;
    }

    @Override
    public void setWidth(int inWidth) {
        mWidth = inWidth;
    }

    @Override
    public int getHeight() {
        return mHeight;
    }

    @Override
    public void setHeight(int inHeight) {
        mHeight = inHeight;
    }
}

package com.jc.hm.LSP.example;

public abstract class Shape {

    /**
     * mHeight
     */
    protected int mHeight;

    /**
     * mWidth
     */
    protected int mWidth;

    /**
     * Get shape's width
     */
    public abstract int getWidth();

    /**
     * Set shape's width
     */
    public abstract void setWidth(int inWidth);

    /**
     * Get shape's height
     */
    public abstract int getHeight();

    /**
     * Set shape's height
     */
    public abstract void setHeight(int inHeight);

    /**
     * Return area of shape
     */
    public int getArea() {
        return mHeight * mWidth;
    }
}

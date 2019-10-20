package com.company;

class Monitor {
    private String name;
    private String color;
    private double height;
    private double width;
    private String resolution;

    public Monitor(String name, String color, double height, double width, String resolution) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = width;
        this.resolution = resolution;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public String getResolution() {
        return resolution;
    }
}


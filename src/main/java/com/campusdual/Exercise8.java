package com.campusdual;

public class Exercise8 {

    public class Car{
        /**fields**/
        String brand;
        String model;
        int maxVelocity;
        String fuel;
        int speedometer;
        int tachometer;

        /**methods**/
        public Car(String brand, String model, int maxVelocity, String fuel, int speedometer, int tachometer) {
            this.brand = brand;
            this.model = model;
            this.maxVelocity = maxVelocity;
            this.fuel = fuel;
            this.speedometer = speedometer;
            this.tachometer = tachometer;
        }
        public void start(){
            System.out.println("starting");
        }
        public void stop(){
            System.out.println("stopping");
        }
        public void speedUp(){
            System.out.println("speeding up");
        }
        public void brake(){
            System.out.println("braking");
        }
        public void turn(){
            System.out.println("turning");
        }
        public void reverse(){
            System.out.println("reversing");
        }
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getMaxVelocity() {
            return maxVelocity;
        }

        public void setMaxVelocity(int maxVelocity) {
            this.maxVelocity = maxVelocity;
        }

        public String getFuel() {
            return fuel;
        }

        public void setFuel(String fuel) {
            this.fuel = fuel;
        }

        public int getSpeedometer() {
            return speedometer;
        }

        public void setSpeedometer(int speedometer) {
            this.speedometer = speedometer;
        }

        public int getTachometer() {
            return tachometer;
        }

        public void setTachometer(int tachometer) {
            this.tachometer = tachometer;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", maxVelocity=" + maxVelocity +
                    ", fuel=" + fuel +
                    ", speedometer=" + speedometer +
                    ", tachometer=" + tachometer +
                    '}';
        }
    }
    public static void main(String[] args) {

    }
}

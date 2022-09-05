package ru.mirea.task2;

public class Ball {
    private String color;
    private double radius;
    enum BallState {JUMP, ROLL, STAY}
    private BallState state;

    public Ball(){
        color="Red";
        radius=32.0;
        state=BallState.STAY;
    }
    public Ball(String color, double radius){
        this.color=color;
        this.radius=radius;
        this.state=BallState.STAY;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }

    public void push(){
        if(state==BallState.ROLL){
            System.out.println("Мяч покатился быстрее");
        }else{
            System.out.println("Мяч покатился");
            state=BallState.ROLL;
        }
    }

    public void stop(){
        if(state==BallState.STAY){
            System.out.println("Мяч уже стоит");
        }else{
            System.out.println("Вы остановили мяч");
            state=BallState.STAY;
        }
    }

    public void throwUp(){
        if(state==BallState.JUMP){
            System.out.println("Мяч прыгает ещё выше");
        }else{
            System.out.println("Теперь мяч прыгает");
            state=BallState.JUMP;
        }
    }
}

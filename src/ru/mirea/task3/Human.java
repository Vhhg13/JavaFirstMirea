package ru.mirea.task3;

public class Human {
    private Head head;
    private Hand[] hands;
    private Leg[] legs;
    private int leadingHand;

    public Human(){
        head=new Head();
        hands=new Hand[2];
        hands[0]=new Hand("Левая");
        hands[1]=new Hand("Правая");

        legs=new Leg[2];
        legs[0]=new Leg("Левая");
        legs[1]=new Leg("Правая");

        leadingHand=1;
    }

    public Human(Head head, Hand[] hands, Leg[] legs){
        this.head=head;
        this.hands=hands;
        this.legs=legs;
        leadingHand=1;
    }

    // Геттеры
    public Head getHead() { return head; }
    public Hand[] getHands() { return hands; }
    public Leg[] getLegs() { return legs; }
    public int getLeadingHand() { return leadingHand; }

    // Единственный сеттер
    public void setLeadingHand(String leadingHand){
        if(leadingHand.compareTo("left")==0)
            this.leadingHand=0;
        else
            this.leadingHand=1;
    }

    public void throwA(Object obj){
        hands[leadingHand].pick(obj);
        hands[leadingHand].accelerate();
        hands[leadingHand].releaseObject();
        System.out.format("Объект [%s] летит\n", obj);
    }
    public void throwAn(Object obj){
        throwA(obj);
    }

    public void kick(Object obj){
        legs[leadingHand].accelerate();
        legs[leadingHand].hit(obj);
        System.out.format("Объект [%s] летит\n", obj);
    }

    public void thinkAbout(Object obj){
        head.getBrain().workOn(obj);
    }

    public String toString() {
        return "Человек №"+System.identityHashCode(this);
    }
}

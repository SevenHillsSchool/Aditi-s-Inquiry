import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.ArrayList;

class Zombie {
  private double powerofZombie;
  private Food award;

  public Zombie() {}

  public Zombie(double pZ) {
    powerofZombie = pZ;
    award = new Food("Level 1 Cookie", 1, 5.0);
  }

  public Zombie(double pZ, Food aw) {
    powerofZombie = pZ;
    award = aw;
  }

  public double getPowerOfZombie() {
    return powerofZombie;
  }

  public void setPowerOfZombie(double pchange) {
    powerofZombie = pchange;
  }
  
  public Food getAward() {
    return award;
  }

  public void setAward(Food f) {
    award = f;
  }

}

class Runner extends Zombie {
  private double speed;
  
  public Runner() {}
  
  public Runner(double pZ) {
    super(6.0*pZ);
    speed = 6.0;
  }
  
  public Runner(double pZ, double sp) {
    super(sp*pZ);
    speed = sp;
  }
  
  public Runner(double pZ, Food aw, double sp) {
    super(pZ * sp, aw);
    speed = sp;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double ch) {
    speed = ch;
  }
}

class RevivedPerson extends Zombie {
  private String humanName;

  public RevivedPerson() {}

  public RevivedPerson(double pZ) {
    super(pZ);
    humanName = "unknown";
  }

  public RevivedPerson(double pZ, String personName) {
    super(pZ);
    humanName = personName;
  }

  public String getHumanName() {
    return humanName;
  }

}

class Spitters extends Zombie {
  private double spit;

  public Spitters() {}

  public Spitters(double pZ) {
    super(pZ*8.0);
    spit = 8.0;
  }

  public Spitters(double pZ, double spi) {
    super(pZ*spi);
    spit = spi;
  }

  public Spitters(double pZ, double spi, Food aw) {
    super(pZ*spi,aw);
    spit = spi;
  }

  public double getSpit() {
    return spit;
  }

  public void setSpit(double spittie) {
    spit = spittie;
  }
}


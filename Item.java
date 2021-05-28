import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Item {
    private String name;
    private int amount;

    public Item() {}

    public Item(String n) {
      name = n;
      amount = 1;
    }

    public Item(String n, int a) {
      name = n;
      amount = a;
    }

    public String getName() {
      return name;
    }

    public int getAmount() {
      return amount;
    }

    public void setAmount(int n) {
      amount = n;
    }
}
  

class Weapon extends Item {

  private double power;

  public Weapon() {}

  public Weapon(String n) {
    super(n);
    power = 50.0;
  }

  public Weapon(String n, int a) {
    super(n, a);
    power = 50.0 * a;
  }

  public Weapon(String n, int a, double p) {
    super(n, a);
    power = p * a;
  }

  public double getPower() {
    return power;
  }

  public void setPower(double k) {
    power = k;
  }

}

class Food extends Item {

  private double energy;

  public Food() {}

  public Food(String n) {
    super(n);
    energy = 25.0;
  }

  public Food(String n, int a) {
    super(n, a);
    energy = 25.0 * a;
  }

  public Food(String n, int a, double e) {
    super(n, a);
    energy = e * a;
  }

  public double getEnergy() {
    return energy;
  }

  public void setEnergy(double j) {
    energy = j;
  }

}

class Clothes extends Item {
  private double protection;

  public Clothes() {}

  public Clothes(String n) {
    super(n);
    protection = 15.0;
  }

  public Clothes(String n, int a) {
    super(n,a);
    protection = 15.0 * a;
  }

  public Clothes(String n, int a, double pr) {
    super(n,a);
    protection = pr * a;
  }

  public double getProtection() {
    return protection;
  }

  public void setProtection(double pro) {
    protection = pro;
  }

}

class Medicine extends Item {
  private double heal;

  public Medicine() {}

  public Medicine(String n) {
    super(n);
    heal = 10.0;
  }

  public Medicine(String n, int a) {
    super(n,a);
    heal = 10.0 * a;
  }

  public Medicine(String n, int a, double he) {
    super(n,a);
    heal = he * a;
  }

  public double getHeal() {
    return heal;
  }

  public void setHeal(double hea) {
    heal = hea;
  }

}

class Tech extends Item {
  private double capacity;

  public Tech() {}

  public Tech(String n) {
    super(n);
    capacity = 20.0;
  }

  public Tech(String n, int a) {
    super(n,a);
    capacity = 20.0 * a;
  }

  public Tech(String n, int a, double cap) {
    super(n,a);
    capacity = cap * a;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capac) {
    capacity = capac;
  }
}

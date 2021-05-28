import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.ArrayList;


//Buttons are not immedietely visible, to view them, slightly increase the screen with your mouse


class Main {

  public static void main(String[] args) {
  JFrame f = new JFrame("Zombie Apocalypse Simulator");
  double stamina = 100.0;

  f.setSize(700, 700);
  f.setLayout(null);
  // make the frame visible
  f.setVisible(true);

  ArrayList<Food> eat = new ArrayList<Food>();
  ArrayList<Weapon> fight = new ArrayList<Weapon>();
  ArrayList<Item> other = new ArrayList<Item>();

  String intro = "It is May 2021. You're a lazy stoner who's got no life and you're sitting on \nyour couch. You turn on the TV to watch your favorite show.";
  JOptionPane.showMessageDialog(f, intro);
  String intro2 = "Instead of the next episode of 'WHAT YOU COULD BE DOING RIGHT NOW' turning up, \nit's an emergency news broadcast. Annoyed, you try to change the channel to watch \nsomething else, but they're all showing the same thing. You give up for now and listen \nbecause this could be important.";
  JOptionPane.showMessageDialog(f, intro2);
  
  String intro3 = "The federal government has declared that there has been an outbreak of 'zombie-like' creatures \nmindlessly killing people in the capital. Those who were attacked have been exhibiting the very same behaviors \nand appearances of these 'zombies'. Even though it's in only one area for now, authorities \nstill recommend preparing for a potential nationwide apocalypse. You think there's nothing to worry about, \nbut then another emergency broadcast shows up and says that the zombies have \nalready spread through the entire East Coast in such a short time span and are heading west."; 
  JOptionPane.showMessageDialog(f, intro3);
  
  String first = "You decide to go around the house and stock\n some supplies and maybe potential weapons.\n Where do you go?";
  JOptionPane.showMessageDialog(f, first);

  JButton kitchen = new JButton("Kitchen");
  kitchen.setBounds(50, 100, 125, 30);
  f.add(kitchen);

  JButton bedroom = new JButton("Bedroom");
  bedroom.setBounds(250, 100, 125, 30);
  f.add(bedroom);

  JButton garage = new JButton("Garage");
  garage.setBounds(250, 300, 125, 30);
  f.add(garage);

    
  kitchen.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        kitchen.setVisible(false);
        f.remove(kitchen);
        bedroom.setVisible(false);
        f.remove(bedroom);
        garage.setVisible(false);
        f.remove(garage);
        
        String k = "You go into the kitchen and gather a knife, some energy bars, and canned food. \nThese will last you for a long time, but eventually you will have to learn how to scavenge \nand make your own food. A kitchen knife, while not the most efficient weapon,\n is extremely useful for a tool and could be used as a last resort in self-defense.";
        JOptionPane.showMessageDialog(f, k);
        
        Weapon kkn = new Weapon("kitchen knife", 1, 10.0);
        fight.add(kkn);
        Food eb = new Food("energy bars", 5, 35.0);
        eat.add(eb);
        Food cf = new Food("canned food", 10, 40.0);
        eat.add(cf);
        
        String k2 = "You turn on the TV to get another update, turns out there's a safe spot \nnear your house. Even though this is a really stupid idea because you barely have anything\n to defend yourself with in case you get confronted by zombies while\n trying to make it to the safe zone, you're gonna do it anyway.";
        JOptionPane.showMessageDialog(f, k2);
        
        String k3 = "As you walk to the safe zone, you\n hear a low growling noise, you turn around to see what it is, \nand not to your surprise, it's a zombie.";
        JOptionPane.showMessageDialog(f,k3);
        
        Food saward = new Food("Level 2 Cookie", 1, 20.0);
        Zombie klev2 = new Zombie(10.0, saward);
        
        JButton kknife = new JButton("Kitchen Knife");
        kknife.setBounds(50,100,125,30);
        f.add(kknife);
        
        kknife.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String k4 = "You attack it once, and it immedietely dies,\n but your knife is worn out.";
            JOptionPane.showMessageDialog(f,k4);
            klev2.setPowerOfZombie(0);
            kkn.setPower(0);
            fight.remove(kkn);
            eat.add(saward);
            String k5 = "You've finally reached the safe zone. You win.\nGAME OVER";
            JOptionPane.showMessageDialog(f,k5);
          }
        });
        
      }
    });

    bedroom.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        kitchen.setVisible(false);
        f.remove(kitchen);
        bedroom.setVisible(false);
        f.remove(bedroom);
        garage.setVisible(false);
        f.remove(garage);
        
        String b = "You find an empty backpack here. This is good because it'll give you\n a place to store any stuff you need for your inventory. There's also some survival \n books near your bookshelf as well, which is weird considering you don't \nreally do that stuff, but oh well, it helps.";
        Item sb = new Item("survival books", 3);
        other.add(sb);
        JOptionPane.showMessageDialog(f, b);
        String b2 = "You decide to go to the garage next, and\n you pick up a machete before you head outside the house.\n You're going to try and purchase a firearm from the\n store without being eaten alive.";
        JOptionPane.showMessageDialog(f, b2);
        Weapon m2 = new Weapon("machete", 1, 30.0);
        fight.add(m2);
        String b3 = "As you head outside, you're able to get a good distance \nwithout being seen by any zombies, but suddenly, you hear\n a low growling voice near you, and not to your \nsurprise, it's a zombie";
        JOptionPane.showMessageDialog(f, b3);
        Zombie lev1 = new Zombie(10.0);
        JButton m2b = new JButton("Machete");
        m2b.setBounds(50, 100, 125, 30);
        f.add(m2b);
        m2b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        m2b.setVisible(false);
        f.remove(m2b);
        m2.setPower((m2.getPower()-lev1.getPowerOfZombie()));
        lev1.setPowerOfZombie(0);
        String b4 = "You attacked the zombie with one blow and it fell to the\n ground. That was surprisingly easy. In addition, you \nalso get a Level 1 Cookie, which can be used as food.";
        JOptionPane.showMessageDialog(f,b4);
        Food faward = lev1.getAward();
        eat.add(faward);
        String b5 = "You've made it towards the store. There \nare some other people there as well, but you can't really be bothered at the moment.\n You purchase a rifle that has a good shooting capacity and relies on little ammo.";
        JOptionPane.showMessageDialog(f,b5);
        Weapon r = new Weapon("Rifle", 1, 60.0);
        fight.add(r);
        String b6 = "The people who you just saw in the store want you to come with \nthem to their safe zone. Even though you decided you couldn't be bothered with them, \nthis seems like something that's gonna help you out a lot in the future. \nWhat do you say?";
        JOptionPane.showMessageDialog(f,b6);
        JButton by = new JButton("Yes");
        by.setBounds(50,100,125,30);
        f.add(by);
        JButton bn = new JButton("No");
        bn.setBounds(250,100,125,30);
        f.add(bn);
        
        by.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            by.setVisible(false);
            f.remove(by);
            bn.setVisible(false);
            f.remove(bn);
            String b7 = "Good choice. You made it to a safe zome and you win.\nGAME OVER";
            JOptionPane.showMessageDialog(f,b7);
          }
        });
        
        bn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            by.setVisible(false);
            f.remove(by);
            bn.setVisible(false);
            f.remove(bn);
            String b8 = "Bad choice. They took it as an offense and straight up shot you in the head. You lose\nGAME OVER";
            JOptionPane.showMessageDialog(f,b8);
          }
        });


      }
    });

        
      }
    });

    garage.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        kitchen.setVisible(false);
        f.remove(kitchen);
        bedroom.setVisible(false);
        f.remove(bedroom);
        garage.setVisible(false);
        f.remove(garage);
        String g = "This is the perfect place to look for possible weapons. \nYou find a machete lying around the tool shed. \nIt's a little rusty, but is in fairly good condition. \nThere's also a crossbow you haven't used since you were a kid,\n back when you were actually active. \nThese should be good for now.";
        JOptionPane.showMessageDialog(f, g);
        Weapon m = new Weapon("machete", 1, 30.0);
        fight.add(m);
        Weapon cb = new Weapon("crossbow", 1, 35.0);
        fight.add(cb);
        String g2 = "This is the best possible way to prepare for the situation \nat hand. You're going to go out and try to find a group of \npeople to band with for protection and backup.";
        JOptionPane.showMessageDialog(f,g2);
        String g3 = "You've been walking around for quite a while, and \nyou just spotted a zombie. Careful though,\n this one seems really dangerous.";
        JOptionPane.showMessageDialog(f,g3);
        Food gfaward = new Food("Level 4 Cookie", 1, 59.0);
        Zombie glev3 = new Zombie(70.0, gfaward);
        JButton mb = new JButton("Machete");
        mb.setBounds(50,100,125,30);
        JButton cbb = new JButton("Crossbow");
        cbb.setBounds(250,100,125,30);
        f.add(mb);
        f.add(cbb);
        
        mb.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            mb.setVisible(false);
            f.remove(mb);
            cbb.setVisible(false);
            f.remove(cbb);
            String g4 = "You strike the zombie with one blow of\n your machete. It looks weaker, but it's\n still standing.";
            JOptionPane.showMessageDialog(f,g4);
            String g5 = "After two more hits, the thing is down.You \nnow earn a level 4 cookie";
            JOptionPane.showMessageDialog(f,g5);
            glev3.setPowerOfZombie(glev3.getPowerOfZombie()-(3*m.getPower()));
            eat.add(glev3.getAward());
            m.setPower(m.getPower()-(3*m.getPower()));
            String g6 = "Unfortunately, because you overused\n your machete, it is worn out, you'll \nhave to go get a new one";
            JOptionPane.showMessageDialog(f,g6);
            fight.remove(m);
            String g7 = "In the midst of all the chaos, you were fortunately near by a safe zone and go there. You win\nGAME OVER";
          }
       });
        
        cbb.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            mb.setVisible(false);
            f.remove(mb);
            cbb.setVisible(false);
            f.remove(cbb);
            String sg4 = "You shoot from your crossbow twice, \nand the zombie drops. You have \n earned a Level 4 Cookie.";
            JOptionPane.showMessageDialog(f,sg4);
           glev3.setPowerOfZombie(glev3.getPowerOfZombie()-(2*cb.getPower()));
           cb.setPower(cb.getPower()-(2*cb.getPower()));
           String sg5 = "In the midst of all the chaos, you were fortunately near by a safe zone and go there. You win\nGAME OVER";
           JOptionPane.showMessageDialog(f,sg5);
          }
        });
        
        
        
        
      }
    });
    
    /*
    // creating instance of JFrmain.javame
    JFrame f = new JFrame();

    // creating instance of JButton
    JButton b = new JButton("Click me!");

    // x axis, y axis, width, height
    b.setBounds(80, 100, 250, 40);

    // add event listener
    b.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Hello world!");
      }
    });

    // add button to JFrame
    f.add(b);

    f.setSize(400, 500);
    f.setLayout(null);
    // make the frame visible
    f.setVisible(true);
    */
  }
} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnull.object.pattern.mangayan;

interface Firearm{
    String getName();
    void makeSound();
}

class Guns implements Firearm{
    private String gname;
    
    public Guns(String gname){
        this.gname = gname;
    }

    @Override
    public String getName() {
        return gname;
    }

    @Override
    public void makeSound() {
        System.out.println(gname + "Sound: Tooof Toof Toof!!!!");
    }
}

class NullGuns implements Firearm{

    @Override
    public String getName() {
        return "Guns is prohibited!";
    }

    @Override
    public void makeSound() {
        System.out.println("Gunshot not available!!");
    }
}
public class NullObjectPatternMangayan {
    public static void main(String[] args) {
        Firearm gun1 = new Guns("AK-47 and M1911 ");
        gun1.makeSound();
        
        Firearm gun2 = null;
        gun2 = new NullGuns();
        gun2.makeSound();
    }
    
}

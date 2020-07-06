package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHealth(300);
        boss.setTypeDefense("Physical");
        System.out.println(boss.getDamage() );
        System.out.println(boss.getHealth());
        System.out.println(boss.getTypeDefense());



    }
}

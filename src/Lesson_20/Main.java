package Lesson_20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("John Doe", 25, 8));
        actors.add(new Actor("Jane Smith", 30, 9));
        actors.add(new Actor("Sam Brown", 22, 7));
        actors.add(new Actor("Lucy Green", 35, 10));


        List<Role> roles = new ArrayList<>();
        roles.add(new Role("Hero", 20, 30));
        roles.add(new Role("Villain", 30, 40));
        roles.add(new Role("Sidekick", 20, 25));
        roles.add(new Role("Extra", 18, 35));
        Collections.sort(actors, new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return Integer.compare(o1.getActingSkill(), o2.getActingSkill());
            } });
        Collections.sort(roles, new Comparator<Role>() {
            @Override
            public int compare(Role o1, Role o2) {
                return o1.getMinAge()-o2.getMinAge();
            }
        });
        for (Actor actor: actors){
            for(Role role: roles){
                if (actor.getAge()>=role.getMinAge()&&actor.getAge()<=role.getMaxAge()){
                    System.out.println(actor.getName() + " is cast as " + role.getName()  +" "+ actor.getAge());
                }
            }
        }
    }
}

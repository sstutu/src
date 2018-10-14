package HelloWorld.面向对象;

public class HorrorShow {//化妆舞会

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        /*DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);*/

       // DangerousMonster
        new Monster(){
            public void menace(){};
        }.menace();
        new Monster(){
            public void menace(){}
            public void destroy(){};
        }.destroy();

        new Lethal()  {
            public void kill(){}
            public void menace(){}
            public void destroy(){};
        }.kill();
        new Lethal(){
            public void kill(){}
            public void menace(){}
            public void destroy(){};
        }.destroy();
        new Lethal(){
            public void kill(){}
            public void menace(){}
            public void destroy(){};
        }.menace();


    }
}

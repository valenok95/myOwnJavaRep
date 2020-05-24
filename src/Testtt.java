public class Testtt {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        String name="Oleg";
        String name2="Oleg2";
        System.out.println(String.format("name1=%s , name2=%3$s,then %d and %4$d",name,a,name2,b));
    //    System.out.println(a);
      /*  Man man = new Man();
        man.increaseAge(20);
        System.out.println(man.age);*/
    }


    public static class Man {
        int age = 20;

        public void increaseAge(int a) {
            this.age += a;
        }

    }
}

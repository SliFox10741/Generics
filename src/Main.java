public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>();
        MagicBox<Integer> magicBox2 = new MagicBox<>();

        magicBox.add("a");
        magicBox.add("b");
        magicBox.add("c");
        magicBox.add("d");
        magicBox.add("e");
        System.out.println(magicBox.pick());

//        magicBox2.add(1);
        magicBox2.add(2);
        magicBox2.add(3);
        magicBox2.add(4);
        magicBox2.add(5);
        System.out.println(magicBox2.pick());
    }
}
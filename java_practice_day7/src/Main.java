public class Main {

    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(23);
        listy.add(40);
        listy.add(-5);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(40));
    }
}

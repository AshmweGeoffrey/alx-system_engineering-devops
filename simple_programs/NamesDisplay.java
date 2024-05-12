public class NamesDisplay {
    public static void main(String[] args) {
        String[][] x = {
                {"Muhire", "Mutoni", "Munana", "Kamana"},
                {"Peter", "Jeoffrey", "Marry", "John"}
        };
        String n=" ";
        // displaying i > jeoffrey Muhire
        System.out.println(x[1][1] + n + x[0][0]);
        // displaying ii > Marry Mutoni

        System.out.println(x[1][2] + n + x[0][1]);
        //displaying  iii >Peter Munana
        System.out.println(x[1][0] + n + x[0][2]);
        //displaying  iv > John Kamana
        System.out.println(x[1][3] + n + x[0][3]);

    }
}

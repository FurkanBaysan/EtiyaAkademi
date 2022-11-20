public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[2][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Edirne";
        cities[0][2] = "Kırklareli";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Karaman";
        System.out.println(cities.length); //2
        System.out.println(cities[0].length);//3

        for (int i = 0; i < cities.length; i++) {
            System.out.println();
            for (int j = 0; j < cities[0].length; j++) {
                System.out.print(cities[i][j] + " ");
            }
        }

    }
}
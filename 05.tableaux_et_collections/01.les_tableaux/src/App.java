public class App {
    public static void main(String[] args) throws Exception {
        var entiers =  new int[][][]{
            {{1, 2, 3},{4, 5, 6,8}, {3, 4, 5, 6}},
            {{1, 2, 3},{4, 5, 6,8}, {3, 4, 9, 6}},
        };

        // var entier = entiers[1][2][2];

        // System.out.println(entier);

        for (int [][] dimentions2 : entiers) {
            for (int[] dimention : dimentions2) {
                for (int entier : dimention) {
                    System.out.print(entier);
                }
    
            }
        }
    }
}

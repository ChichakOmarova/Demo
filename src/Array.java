public class Array {
    public static void main(String[] args) {
        Object[][] mixedArray = new Object[12][3];

                 mixedArray[0][0] = "A class";
                 mixedArray[0][1] = "Math";
                 mixedArray[0][2] = "75%";


                 mixedArray[1][0] = "A class";
                 mixedArray[1][1] = "Engineering";
                 mixedArray[1][2] = "77%";


                 mixedArray[2][0] = "A class";
                 mixedArray[2][1] = "English";
                 mixedArray[2][2] = "96%";

                 mixedArray[3][0] = "B class";
                 mixedArray[3][1] = "Math";
                 mixedArray[3][2] = "92%";

                 mixedArray[4][0] = "B class";
                 mixedArray[4][1] = "Engineering";
                 mixedArray[4][2] = "79%";

                 mixedArray[5][0] = "B class";
                 mixedArray[5][1] = "English";
                 mixedArray[5][2] = "8%";

                 mixedArray[6][0] = "C class";
                 mixedArray[6][1] = "Math";
                 mixedArray[6][2] = "90%";

                 mixedArray[7][0] = "C class";
                 mixedArray[7][1] = "Engineering";
                 mixedArray[7][2] = "89%";

                 mixedArray[8][0] = "C class";
                 mixedArray[8][1] = "English";
                 mixedArray[8][2] = "78%";

                 mixedArray[9][0] = "D class";
                 mixedArray[9][1] = "Math";
                 mixedArray[9][2] = "98%";

                 mixedArray[10][0] = "D class";
                 mixedArray[10][1] = "Engineering";
                 mixedArray[10][2] = "81%";

                 mixedArray[11][0] = "D class";
                 mixedArray[11][1] = "Math";
                 mixedArray[11][2] = "94%";
                 System.out.println("mixedArray:" );
                 for( int i = 0; i < mixedArray.length; i++ ){
                     for( int j = 0; j < mixedArray[i].length; j++ ){
                         System.out.print(mixedArray[i][j] + " ");
                     }
                     System.out.println();
                 }








    }
}

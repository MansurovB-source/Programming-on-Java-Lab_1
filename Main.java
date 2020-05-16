import static java.lang.Math.*;

 public class lab {
     public static void main(String[] args) {
         short[] c = new short[9];
         short cur = 6;
         for (int i = 0; i < 9; i++) {
             c[i] = cur;
             cur += 2;

         }
         float[] x = new float[19];
         for (int j = 0; j < 19; j++) {
             x[j] = (float) round(random() * 16.0f - 3.0f);
         }
         double[][] b = new double[9][19];
         for (int i = 0; i < 9; i++) {
             for (int j = 0; j < 19; j++) {
                 if (c[i] == 18) {
                     b[i][j] = pow(E, pow(E, atan(x[j] + 15.0d / 16.0d)));
                 } else if (c[i] == 6 || c[i] == 8 || c[i] == 20 || c[i] == 22) {
                     b[i][j] = atan(cos(sin(pow(x[j], (3.0d / 4.0d + x[j])))));
				 }
				 else {
                     b[i][j] = pow(((pow((log(pow(sin(x[j]), 2.0d))), ((pow(E, pow(x[j], 2.0d * x[j]))) 
					 * (asin(cos(x[j])) - 1.0d)))) / ((atan(pow(E,cbrt(-acos((x[j]+5.0f)/(16.0f))) ))) + 1.0d)), 2);
				 }
		 	 }
		 }
		 System.out.println();
		 for (int i=0; i < 9; i++){
			 for (int j = 0; j < 19; j++){
				 System.out.printf("%9.5f ", b[i][j]);
			 }
			 System.out.println();


		 }
	 }
 }	 
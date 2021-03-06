package util;

import geometry.FiguraGeometrica;

public class MathUtil {
    public static int mcm(int num1, int num2){
        int mcm,i;
        mcm=1;
        i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
                mcm=mcm*i;
                if(num1%i==0) num1=num1/i;
                if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;
        }
        return mcm;
    }
    public static double areaPromedio(FiguraGeometrica arr[]){
        int totalArea = 0;
        for (int i = 0; i < arr.length; i++) {
            totalArea+=arr[i].area();
        }
        double result = totalArea / arr.length;
        return result;
    }
}

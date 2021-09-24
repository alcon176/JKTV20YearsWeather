/*
 * Создадим зубчатый массив хранищий температуру каждого дня в году, у каждого
   в году ,учитывая сезон и выводим его на консоль
 * 
 *
 */
package jktv20yearsweather;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20YearsWeather {
    public static enum Month{
    Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август,
    Сентябрь, Октябрь, Ноябрь, Декабрь
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = -20, max = 20, dayinMonth = 0;
        Random random = new Random();
        // Создаем зубчатый массив из 12 строк
        int[][] yearsWeather = new int[12][];
        System.out.print("          ");
        for (int i = 0; i < 31; i++){

            System.out.printf("%4d",i+1);
        }
        System.out.println("");
        System.out.print("            ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 12; i++){
             System.out.print("");
            switch (i) {
                case 0: min = -20; max = -5; dayinMonth = 31; break;
                case 1: min = -20; max = 0; dayinMonth = 28; break;
                case 2: min = -15; max = 5; dayinMonth = 31; break;
                case 3: min = -10; max = 10; dayinMonth = 30; break;
                case 4: min = -5; max = 15; dayinMonth = 31; break;
                case 5: min = 5; max = 20; dayinMonth = 30; break;
                case 6: min = 10; max = 30; dayinMonth = 31; break;
                case 7: min = 10; max = 25; dayinMonth = 31; break;
                case 8: min = 0; max = 20; dayinMonth = 30; break;
                case 9: min = -5; max = 10; dayinMonth = 31; break;
                case 10: min = -10; max = 5; dayinMonth = 31; break;
                case 11: min = -15; max = 0; dayinMonth = 31; break;
                
            }
            yearsWeather[i]= new int[dayinMonth];
            double sum = 0.0;
            System.out.printf("%8s: ",Month.values()[i]);
            for (int j = 0; j < yearsWeather[i].length; j++){
                yearsWeather[i][j] = random.nextInt(max - min +1)+ min;
                sum += yearsWeather[i][j];
                System.out.printf("%4d",yearsWeather[i][j]);
            }
            System.out.println(" | %2f "+sum/dayinMonth);
            System.out.println();
        }       
        }
    }
    


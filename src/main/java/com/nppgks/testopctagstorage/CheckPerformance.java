package com.nppgks.testopctagstorage;

public class CheckPerformance {
    public static void main(String[] args) {
        double[][] arr = new double[1000][1000];
        System.out.println("Start");

        for(int i = 0; i< 1000; i++){
            long durationByRow = getDurationByRow(arr);
            long durationByCol = getDurationByCol(arr);
            if(durationByRow>durationByCol) System.out.println("By row takes more time than by col");
        }
        System.out.println("End");
    }

    static long getDurationByRow(double[][] arr){
        long startTime = System.nanoTime();

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = i+j;
            }
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    static long getDurationByCol(double[][] arr){
        long startTime = System.nanoTime();

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[j][i] = i+j;
            }
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}

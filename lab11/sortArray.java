//Tamara Julia Johnson
//CSE 002 310
//Lab11-Sorting and Merging rrays
//11/05/15
//Create a program that gives us practice with sorting and merging arrays

        //define class
            public class sortArray {
                 //add main method
                    public static void main(String[] args) {
                        //create arrays
                        int[] arrayOne = new int[20];
                        int[] arrayTwo = new int[10];
                        int[] arrayThree = new int[30];
                            //for loop to initialize array with random numbers
                            for(int i = 0; i < arrayOne.length; i++) {
                                arrayOne[i] = (int)(Math.random()*100);
                                arrayThree[i]=arrayOne[i];
                            }             
                            //for loop to initialize array with random numbers
                            for(int i = 0; i < arrayTwo.length; i++) {
                                arrayTwo[i] = (int)(Math.random()*100);
                                arrayThree[i+20]=arrayTwo[i];
                            }
                        //sort arrays
                        sort(arrayOne);
                        System.out.println("");
                        sort(arrayTwo);
                        System.out.println("");
                        sort(arrayThree);
                        System.out.println("");
      
                    }
      
                    //void method to combine arrays and sort
                    public static void sort(int[] arrayOne) {
                        int x;
                        for(int j = 0; j < arrayOne.length; j++) {
                             for(int k =0; k <arrayOne.length; k++) {
                                if(arrayOne[j] < arrayOne[k]) {
                                    x = arrayOne[k];
                                    arrayOne[k] = arrayOne[j];
                                    arrayOne[j] = x;
                                }
                            }
                        }
                        for (int h =0; h<arrayOne.length; h++) {
                          System.out.print(arrayOne[h]+" ");
                        }
                    }
            }
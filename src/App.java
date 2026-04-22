public class App {  
    
    public static void main(String[] args) throws Exception{
        int[] numeros ={ 10, 0, -5, 5, 15, 2};
        //runBubbleSort();
        runBubbleSortAvz();
    }

    public static void runBubbleSort(){
        // System.out.println("metodo burbuja");
        // int[]numeros = {-5, 10, 2, 0, 7};
        // //instanciar una clase
        // BubbleSort bubbleSort= new BubbleSort();
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendete(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros,true);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros, false);
        // bubbleSort.sort(numeros);
    }

    public static void runBubbleSortAvz(){
        int [] array = new int[]{9,2,3,0,8,5};

        //instancia la clase
        BubbleSortAvz bSortAvz =new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort(true);
        bSortAvz.printArray();
    }
    
}
   public class BubbleSort{
   public static void sortDescendet (int[] numeros) {
         for (int i = 0 ;  i >numeros.length; i++){
            for (int j = i + 1; j < numeros.length; j++){
                //comparacion
                if (numeros[i]> numeros[j]){
                // si cumple -> intercambio
                    int aux = numeros[1];
                    numeros[i]= numeros [j];
                    numeros[j]= aux; 
                }

            }
        }
    

    }
        public void printArreglo(int[] numeros){
             for (int i : numeros){
                System.out.print(i + ", ");
            }
        }
        
        ///
        /// [asc] TRUE ordenara ascendentemente 
        /// [asc] FALSE ordenara descendentemente
        /// 
        public void sort(int[] numeros, boolean asc){
            if(asc){
                sortAscendent(numeros);
            }else{
                sortDescendet(numeros);
            }
        }
 }   

        
       
           
        


package javasorts;


public class SelectionSortChar {
    
    private static int indexMinArray(char array[], int posAtual) {
        int k = posAtual;
        int tam = array.length;
        for(int i = posAtual + 1; i < tam; i++) {
            if(array[i] < array[k]) {
                k = i;
            }
        }
        return k;
    }
    
     public static void sSort(char array[]) {
        int tam = array.length;
        for(int i = 0; i < tam - 1; i++) {
            int k = indexMinArray(array, i);
            char temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }
}

package modul_4_smt2;
public class No3 {
    public static void Selection(int[] A){
        int smallIndeks;
        int pass, j, n = A.length;
        int temp;
        
        //Indeks of smallest element in the sublist
        for(pass = 0; pass < n - 1; pass++){ //pass=0; 0<4;T
            smallIndeks = pass;              //0
            for(j = pass + 1; j < n; j++){   //j-1; 1<5 /j=2; 2<5
                if(A[j] < A[smallIndeks]){   //A[1]<A[0]-6<10;T /A[2]<A[1]; 8<6;F
                    smallIndeks = j; //1 /2
                }
            }
            //Tukar nilai terkecil dengan array[pass]
            temp = A[pass];
            A[pass] = A[smallIndeks];
            A[smallIndeks] = temp;
        }      
    }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13 ,3};
        No3.tampil(A);
        No3.Selection(A);
        No3.tampil(A);
    System.out.println();
    System.out.println("Irfan Triadi Saputra");
    System.out.println("20090017");
    System.out.println("Kelas 2B DIV Teknik Informatika");    
    }
}

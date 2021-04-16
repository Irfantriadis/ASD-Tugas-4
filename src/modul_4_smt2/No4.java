package modul_4_smt2;
public class No4 {
    public static void shellSort(int[]arr){
        int n=arr.length;
        int C,M;
        int jarak,i,j,kondisi;
        boolean Sudah=true;
        int temp;
        C=0;
        M=0;
        jarak=n;
        while (jarak>=1){
            jarak=jarak/2;
            Sudah = true;
            while(Sudah){
                Sudah=false;
                for(j=0;j<n-jarak;j++){
                    i=j+jarak;
                    C++;
                    if(arr[j]>arr[i]){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        Sudah=true;
                    }
                }
            }
        }
    }    
    public static void tampil(int data[]){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int A[]={25, 7 , 9, 13, 3};
        No4.tampil(A);
        No4.shellSort(A);
        No4.tampil(A);
    System.out.println();
    System.out.println("Irfan Triadi Saputra");
    System.out.println("20090017");
    System.out.println("Kelas 2B DIV Teknik Informatika"); 
    }
}

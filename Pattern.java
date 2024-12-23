/*class Pattern{
    public static void main(String[] args) {
        int k = 1;
        for(int i = 1; i <=5 ; i++){
            
            for (int j = 1; j <=5; j++) {
                System.out.print(" " + k);
                k++;
            }
            System.out.println();
        }
    }
}*/

class Pattern{
    public static void main(String[] args) {
        int i,j,x,y;
        for ( i = 1; i <=5; i++) {
            x=i;
            y = 5-i+1;
            for (j = 1; j <= 5; j++) {
            if(j%2 ==1){
                System.out.print(" "+ x);
            }else{
                System.out.print( " "+ y);
            }
            x = x+5;
            y = y+1;
            
            }
            System.out.println();
        }
    }
}
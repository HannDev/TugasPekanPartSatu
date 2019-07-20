public class soal3 {
    public static void main(String[] args) {
        for(int x=1; x<=9; x++){
            for(int y=1; y<=9; y++){
                if(y==1||y==3||y==5||y==7||y==9) {
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}

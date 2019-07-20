public class soal5{
    public static void main(String[] args) {
        for(int x=1; x<10; x++){
            for(int y=1; y<10; y++){
                if(x==y||x==1||y==1||x==9||y==9) {
                    System.out.print("+ ");
                }else if(x<y){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
                System.out.println();
        }
    }
}
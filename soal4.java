public class soal4 {
    public static void main(String[] args) {
        for(int x=1; x<10; x++){
            for(int y=1; y<10; y++){
                if(x==y||10-x==y||x==5||y==5){
                    System.out.print("+ ");
                    }else{
                        System.out.print("- ");
                    }
                }
            System.out.println();
            }
        }
    }

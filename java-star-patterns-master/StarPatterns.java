/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [          ] <-- you
 * @version [          ] <-- today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int    j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int x = h;
        
        for(int i=0; i<h; i++){
            for(int y=0; y<x; y++){
                if(i==0 || i==h-1 || i+y==h-1){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void starXBox(int h){
        int w=h;
        
        for(int x=0;x<w; x++){
            for(int y=0; y<h; y++){
                if(x==0||x==w-1||x+y==h-1||x==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void twoStarBoxes(int h, int w){
        for(int i=0; i<w; i++){
            for(int j=0; j<h; j++){
                if(i<w/2 && j<h/2){
                    System.out.print("*");
                }
                else if(i>=w/2 && j>=h/2){
                    System.out.print("*");
                }   
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }           
        }
        
    public static void starTriangle(int h){
        int w=h;
        int length = h-2;
        //i row
        //x col

        for(int i=0; i<w; i++){
            for(int x=0; x<h; x++){
               if(x==0|| i==x || i==h-1 || i>x){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
                }
               
             }
            System.out.println();
        }
    }
    
    public static void emptyTriangle(int h){
        int w=h;
        int length = h-2;
        //i row
        //x col

        for(int i=0; i<w; i++){
            for(int x=0; x<h; x++){
               if(x==0|| i==x || i==h-1){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
                }
               
             }
            System.out.println();
        }
    }
    
    public static void startTriangleUR(int h){
        int w = h;
        
        for(int i=0; i<w; i++){
            for(int x=0; x<h; x++){
                if (i==x||x>i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void isoscelesStarTriangle(int h){
        int len = (h-1) + h;
        int w=len;
        int start = (len/2);
        
        for(int i=0; i<h; i++){
            for(int x=0; x<len; x++){    
                if(x== h-1|| i==h-1|| x+i>=h-1 && x<=4 || x-i<=h-1 && x>=4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
    }
    
    public static void checkerBoard(int h){
        for(int i=0; i<h; i++){
            for(int x=0; x<h+2; x++){
                if ((i%2==0 && x==0) || (x+i) % 2 == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    
    public static void biggerCheckerBoard(int h, int Segment, int len){
        for(int i=0; i<h; i++){
            for(int x=0; x<h; h++){
                
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        starXBox(7);
        System.out.println();
        
        twoStarBoxes(12, 8);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(6);
        System.out.println();
        
        startTriangleUR(10);
        System.out.println();
        
        isoscelesStarTriangle(5);
        System.out.println();
        
        checkerBoard(6);
        System.out.println();
        
        biggerCheckerBoard(8, 3, 5);
        System.out.println();
            
    }
     
}
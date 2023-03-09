class TestRectangle {

    public static void main(String[] args){
        Rectangle rect0 = new Rectangle();
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();
        Rectangle rect6 = new Rectangle();
        Rectangle rect7 = new Rectangle();
        Rectangle rect8 = new Rectangle();
        Rectangle rect9 = new Rectangle();
        

        Rectangle[] rects = new Rectangle[10];
        rects[0] = rect0;
        rects[1] = rect1;
        rects[2] = rect2;
        rects[3] = rect3;
        rects[4] = rect4;
        rects[5] = rect5;
        rects[6] = rect6;
        rects[7] = rect7;
        rects[8] = rect8;
        rects[9] = rect9;

        for (int i = 0; i <= 9; i++){
            rects[i].width = Math.random();
            rects[i].height = Math.random();

            // System.out.printf("\nrect"+i);
            // System.out.printf("\nwidth: "+ rects[i].width);
            // System.out.printf("\nheight: "+ rects[i].height);
            // System.out.printf("\narea: "+ rects[i].height*rects[i].width);
        }
        double smallest = rects[0].width*rects[0].height;
        double largest = rects[0].width*rects[0].height;
        double largestWidth = rects[0].width;
        double largestHeight = rects[0].height;
        double smallestWidth = rects[0].width;
        double smallestHeight = rects[0].height;
        for (int i = 0; i <= 9; i++){
            if (rects[i].width*rects[i].height < smallest) {
                smallest = rects[i].width*rects[i].height;
                smallestWidth = rects[i].width;
                smallestHeight = rects[i].height;
            }
            if (rects[i].width*rects[i].height > largest) {
                largest = rects[i].width*rects[i].height;
                largestWidth = rects[i].width;
                largestHeight = rects[i].height;
            }
        }
        
        System.out.printf("\nsmallest area: "+ smallest); 
        System.out.printf("\nsmallest width: "+ smallestWidth); 
        System.out.printf("\nsmallest width: "+ smallestHeight); 
        System.out.printf("\nlargest area: "+ largest);
        System.out.printf("\nlargest width: "+ largestWidth); 
        System.out.printf("\nlargest height: "+ largestHeight); 


        // System.out.println("rect0");
        // System.out.printf("width: "+ rects[0].width);
        // System.out.printf("\nheight: "+ rects[0].height);
        // System.out.printf("\narea: "+ rects[0].height*rects[0].width);

        // System.out.println("\nrect1");
        // System.out.printf("width: "+ rects[1].width);
        // System.out.printf("\nheight: "+ rects[1].height);
        // System.out.printf("\narea: "+ rects[1].height*rects[1].width);

        



    }
}
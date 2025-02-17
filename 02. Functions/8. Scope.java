class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        {
            //int a=89;   //a already initialised in parent so can't initalise again
            a = 45;       //but we can change the value
            int c =70;     //its scope in just this block
        }
        // System.out.println(c); //c only define in upper box can't work here

        int c =56;  //also we can again in parent block

//        System.out.println(makrs);

        for (int i = 0; i <6; i++) {
            int num=10;
            // int a =10;  //a already initialised in parent so can't initalise again
            System.out.println(i);
        }


    }

    static void random(int marks){
        int num =65;
        System.out.println(num);
        System.out.println(marks);
    }
}

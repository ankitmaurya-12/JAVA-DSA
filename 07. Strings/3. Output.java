import java.util.Arrays;

class Output {
    public static void main(String[] args) {

        System.out.println(56);                         //it will treated as integer
        System.out.println("Ankit");                    // It will treated as String
        System.out.println(new int[]{1,2,3,4,4,5});     //It will treated as Object

        //same println function treat diffrent input diffrently
        // This called function Overloading

        //Internally String class call 'toString()'

        String name =null;
        System.out.println(name);

        // return (obj == null) ? "null" : obj.toString();
        //It define in the String class it obj == null is not there it will throw the null pointer exception



        // ------------------------------------------------------------------------------
        System.out.println(new int[]{1,2,3,4,4,5});     //It will treated as Object
        // For JAVA in toString how does it know weather it which object therefor it will take it's name + @ + default hash value
        //Hence above one represent like [I@7b23ec81
        //To resolve above issue we will use toString method of array.
        //Similarly we can alos override it by using own toString
        System.out.println(Arrays.toString(new int[]{1,2,3,4,4,5}));

        //_______________________________________________________________________________________________-


        System.out.println(43);
        Integer num = new Integer(43);     //we have wrapped it in variable num
        System.out.println(num.toString());
        System.out.println(num);
        //These both are same thing that's why it showing blur on toString()


    }
}

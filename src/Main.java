public class Main {
    public static void main(String[] args) {

        /*//Integer intVal = new Integer(10);
        Integer intVal = 10; //auto boxing
        //int i = intVal.intValue();
        int i = intVal; //auto unboxing*/

        //1
        /*Holder holder1 = new Holder(10);
        System.out.println(holder1.getData());

        holder1.setData(20);
        System.out.println(holder1.getData());

        Holder holder2 = new Holder("BitCode");
        System.out.println(holder2.getData());*/

        //2
        Holder intHolder = new Holder(100);
        System.out.println(intHolder.getData());

        int i = (int) intHolder.getData(); //type casting is needed

        Holder stringHolder = new Holder("BitCode");
        System.out.println(stringHolder.getData());
        String name = (String) stringHolder.getData(); //type casting needed

        //int j = (int) stringHolder.getData();  //class cast exception, you have to get careful while type casting

        Holder h = new Holder("Java");
        //h.setData(3000); // h is supposed to hold String as per req, however by mistake we may put different type of data

        String skill = (String) h.getData();

    }
}

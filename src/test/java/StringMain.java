public class StringMain {
    public static void main(String[] args) {
        IOperateString operateString = new OperateString();
        //分割字符串
       /* String[] strings = operateString.segmentationString("ab&&c");

        for (String s : strings){
            System.out.println(s);
        }*/
       String[] s = {"2","ab","33"};
        String s1 = operateString.combinationString(s);
        System.out.println(s1);


    }
}

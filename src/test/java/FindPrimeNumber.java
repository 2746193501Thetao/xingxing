public class FindPrimeNumber {
    public static void main(String[] args) {
        Boolean flag = true;

//        long start = System.currentTimeMillis();

        for(int i = 2;i <= 1000;i++){
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){     // i 被 j 整除，不是质数
                    flag = false;   // flag 置为false
                    break;
                }
            }
            if(flag == true){
                System.out.print(i + " ");
            }
            flag = true;            //将 flag 重置为 true
        }

//        long end = System.currentTimeMillis();
//        System.out.println("所花费的时间为：" + (end - start));
    }
}

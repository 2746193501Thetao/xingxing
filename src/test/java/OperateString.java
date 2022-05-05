public class OperateString implements IOperateString {
    @Override
    public String[] segmentationString(String s) {
        String[] split = s.split("&&");

        return split;
    }

    @Override
    public String combinationString(String[] s) {
        StringBuffer sb = new StringBuffer();

//        String s1="";
        for (int i=0;i<s.length;i++){
            if (s.length-1==i){
                sb.append(s[i]);
            }else {
                sb.append(s[i]+"&&");
            }

        }
        return sb.toString();
    }
}

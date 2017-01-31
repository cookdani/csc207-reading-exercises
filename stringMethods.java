public class stringMethods
{

    public static boolean endsWithRep(String s1, String s2, int n){
        String str = s2;
        for (int i = 1; i < n; i++){
            str = str + s2;
        }
        if (s1.endsWith(str))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        if (endsWithRep("foobarbar","bar",2))
            System.out.printf("test 1 returns true\n");
        else
            System.out.printf("test 1 returns false\n");
        if (endsWithRep("foobarbar","baz",1))
            System.out.printf("test 2 returns true\n");
        else
            System.out.printf("test 2 returns false\n");
    }
}

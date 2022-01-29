package classWork;

public class q6 {
    public static void main(String[] args) {
        int uStart,uEnd,uStep;
        uStart = Integer.parseInt(args[0]);
        uEnd = Integer.parseInt(args[1]);
        uStep = Integer.parseInt(args[2]);

        for (; uStart <= uEnd; uStart+=uStep) {
            System.out.println(uStart);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }

    public static void task12 () {
        System.out.println("Задачи 1 и 2");
        int[] A = new int[]{1, 2, 3};
        for (int index = 0; index < A.length; index++) {
            if (index == A.length - 1) {
                System.out.println(A[index]);
                break;
            }
            System.out.print(A[index] + ", ");
        }
        double[] B = {1.57, 7.654, 9.986};
        for (int index = 0; index < B.length; index++) {
            if (index == B.length - 1) {
                System.out.println(B[index]);
                break;
            }
            System.out.print(B[index] + ", ");
        }
        int[] C = new int[12];
        for (int i = 0; i < C.length; i++) {
            C[i] = i+3;
        }
        for (int index = 0; index < C.length; index++) {
            if (index == C.length - 1) {
                System.out.println(C[index]);
                break;
            }
            System.out.print(C[index] + ", ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] A = new int[]{1, 2, 3};
        for (int index = A.length-1; index >=0 ; index = index -1) {
            if (index == 0) {
                System.out.println(A[index]);
                break;
            }
            System.out.print(A[index] + ", ");
        }
        double[] B = {1.57, 7.654, 9.986};
        for (int index = B.length-1; index >=0 ; index = index - 1) {
            if (index == 0) {
                System.out.println(B[index]);
                break;
            }
            System.out.print(B[index] + ", ");
        }
        int[] C = new int[12];
        for (int i = 0; i < C.length; i++) {
            C[i] = i+3;
        }
        for (int index = C.length-1; index >=0 ; index = index - 1) {
            if (index == 0) {
                System.out.println(C[index]);
                break;
            }
            System.out.print(C[index] + ", ");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] A = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (A[i] % 2 != 0)
            A[i]=A[i]+1;
            System.out.println(A[i]);
        }
        }
}

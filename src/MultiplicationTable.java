public class MultiplicationTable {

    // If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
    void print(){
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }

    void print(int n){
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d * %d = %d", n, i, n * i).println();
        }
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        table.print();
        table.print(6);
    }
}

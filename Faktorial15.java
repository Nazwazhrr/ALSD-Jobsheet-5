public class Faktorial15 {

    int faktorialBF(int n){
        int fakto = 1, i = 1;
        do {
            fakto *= i;
            i++;
        } while (i <= n);
        return fakto;
    }
    int faktorialDC(int n){
        if (n == 0) {
            return 1;
    }else{
        int fakto = n * faktorialDC(n-1);
        return fakto;
    }
    }
}
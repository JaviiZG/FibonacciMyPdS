package fibonacci;

public class fibonacci {
    public long funcion(int n)
    {
        if (n>1){
            long a = 0, b = 1, c;
            for(int i=0; i<n; i++){
                c=b+a;
                a=b;
                b=c;
            }

            return a;
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            throw new RuntimeException("El tamaño debe ser mayor o igual a 0");
        }
    }
}

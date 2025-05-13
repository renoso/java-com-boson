public class setimoProjeto {
    /// vamos trabalhar com operadores de atribuição nessa aula
     /// 
     /// (+= / x = x+y)
     /// (-= / x = +-y)
     /// (*= / x = x*y)
     /// (/= / x = x/y)
     /// (%= / x = x%y)
    
     public static void main(String[] args) {
        int num = 0;

        System.out.println("valor original: " + num);
        num += 3;
        System.out.println("Valor de num: " + num);
        num *= 4;
        System.out.println("Valor de num: " + num);
        num /= 2;
        System.out.println("Valor de num: " + num);
        num %= 2;
        System.out.println("Valor de num: " + num);
     }
}

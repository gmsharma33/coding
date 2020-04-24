class SumOfQubesOfDigits {
 public static void main(String[] args){
  for(int i = 1; i < 100000; i++) {
   int n = i;
   int q, rem = -1;
   int sum = 0;
   do {
	q = n % 10;
	sum += q * q * q;
	rem = n / 10;
	n = n / 10;
   } while (rem != 0);
   if( i == sum){
    System.out.println(i);
   }
  }
 }
}

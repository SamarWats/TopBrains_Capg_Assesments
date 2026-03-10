package trainer1;

import Trainer3.Sum;

public class Add{
//	@Override
//	public int calculate(int a, int b) {
//		return a+b;
//	}
//	
	public static void main(String[] args) {
//		Add obj = new Add();
//		System.out.println(obj.calculate(10,5));
//		obj.m2();
		
		ICalculator cal = (x,y) -> {
            System.out.println("Sum is:");
            return x + y;
        };

        System.out.println(cal.calculate(10,6));

        // Product
        ICalculator cal2 = (x,y) -> {
            System.out.println("Product is:");
            return x * y;
        };

        System.out.println(cal2.calculate(10,6));
        
        //method reference
        ICalculator cal3 = new Sum()::add;
        System.out.println(cal2.calculate(10,6));
        
	}
}

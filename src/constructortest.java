/**
 * 
 */
//pull request
/**
 * @author Ameet
 *
 */
public class constructortest {
	int a;
	double b;
	constructortest(int a)
{
			this.a=a;
			System.out.println("Constructor A"+ a);
		}
	constructortest(double b){
		this.b=b;
		System.out.println("Constructor B"+b);
		}
	constructortest()
	{
		System.out.println("in default constructore");
		
	}

}

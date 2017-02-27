package exerciseseven;
public interface I {public void foo(); }
public class C implements I {
	public void foo() {System.out.println("C.foo"); }
	public void bar () { System.out.println("C.bar");}
	public static void main(String[] args){
		I i = new C();
		i.foo();
		//i.bar();
	}
}
/*

The code does not type check because the interface I cannot invoke bar since bar is not included in I - only foo is.
*/

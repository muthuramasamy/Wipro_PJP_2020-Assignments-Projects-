package Interface_Instrumentplay;
/*
 * @author MUTHUSUNDARAM_T
 */
public class test_inter {

	public static void main(String[] args)
	{
		veena v = new veena();
		saxo s = new saxo();
		v.play();s.play();
		System.out.println();
		playable pv = new veena();
		playable ps = new saxo();
		pv.play();ps.play();
	}
}

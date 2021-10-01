import java.util.ArrayList;

public class ejer2 {

	public static void main(String[] args) {
//
//		String[] listaAlumnos = new String[] {"oscar", "sergio", "ximo", "yosu", "aleix", "nestor"};
//		
//		for(int i =0; i < listaAlumnos.length; i++) {
//			System.out.println(listaAlumnos[i]);
//		}
		
		
		ArrayList<String> alumnos = new ArrayList<String>();
		
		alumnos.add("yosu");
		alumnos.add("oscar");
		alumnos.add("sergio");
		alumnos.add("ximo");
		alumnos.add("nestor");
		alumnos.add("aleix");
		
		for(int i =0; i < alumnos.size(); i++) {
			System.out.println(alumnos.get(i));
		}
		
	}

}

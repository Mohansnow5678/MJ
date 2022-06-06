package chapter8;

public class Inherit7 {

	public static void main(String[] args) {

		Governidcard stud =new Governstudent();
		Matricidcard ourstud =new Matricstudent();

		Inherit7 Camp =new Inherit7();
		Camp.Ordinaryroom(stud);
		Camp.luxuryroom(ourstud);
		Camp.mess((Matricidcard)stud);

	}

	public void luxuryroom(Matricidcard ci) {
	}
	public void Ordinaryroom(Governidcard ci) {
	}

	public void mess(Matricidcard ci) {

	}

}

interface Governidcard {

}

interface Matricidcard {

}

class Governstudent implements Governidcard, Matricidcard {

}

class Matricstudent implements Matricidcard {

}

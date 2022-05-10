


package code;



public class Doctor {

	public static void main(String[] args) {

  String fr="Float";
  String ft="Float1";
  int sc=12;
  String Ag="Age";
  String tr="Wharehouse";
  String Wh="Wh1";
  
  String temp = fr;
  fr=ft;
  ft=temp;
  
  String cv=String.valueOf(Ag);
  
  String sr =cv;
  cv=Ag;
  Ag=sr;
  
  String hn=tr;
  tr=Wh;
  Wh=hn;
  
  String Result=("\""+fr+":"+ft+"/"+sc+":"+Ag+"/"+tr+":"+Wh+"\"");
  
  System.out.println(Result.toUpperCase());
  
     
		  }
		}

	

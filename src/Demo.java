import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Subject channel = new YoutubeChannel();
		
		Observer aman = new Subsriber("aman") ;
		channel.subcribe(aman);
		
		Observer raman = new Subsriber("raman") ;
		channel.subcribe(raman);
		
		channel.newVideoUploaded("Design Pattern");
		
		channel.newVideoUploaded("Microservices");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1: To Upload the Video");
			System.out.println("Press 2 : To create the Subsriber");
			System.out.println("Press 3: To Exit");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter Video Title : ");
				String videoTitle = br.readLine();
				channel.newVideoUploaded(videoTitle);
			}
			else if(c==2){
				System.out.println("Enter name of subsriber : ");
				String subName = br.readLine();
				Observer sub = new Subsriber(subName) ;
				channel.subcribe(sub);
				
			}
			else if(c==3) {
				System.out.println("Thank you for using App");
				break;
			}
			else {
				System.out.println("Wrong input, Thank you for using App");
				break;	
			}
		}
	}

}

package gui;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length!=0){
			
			int param=0;
			String arg0=args[0];
			try{
				param=Integer.parseInt(arg0);
			}catch(Exception e){
				System.out.println("Neispravna vrednost ulaznog parametra");
				System.exit(0);
			}
			
			switch (param) {
			
			case 1: FrameLogin1 frame = new FrameLogin1();
			frame.setVisible(true);
			break;
			
			case 2: FrameLekovi1 frameL1= new FrameLekovi1 ();
			frameL1.setVisible(true);
			break;
			
			case 3: FrameLekovi2 frameL2= new FrameLekovi2();
			frameL2.setVisible(true);
			break;
			
			/*case 4: FrameLekovi3 frameL3= new FrameLekovi3();
			frameL3.setVisible(true);
			break;
			*/
			case 5: FrameLekovi4 frameL4= new FrameLekovi4();
			frameL4.setVisible(true);
			break;
			
			case 6: FrameRecepti1 frameR1= new FrameRecepti1();
			frameR1.setVisible(true);
			break;
			
			case 7: FrameRecepti2 frameR2= new FrameRecepti2();
			frameR2.setVisible(true);
			break;
			
			case 8: FrameRecepti3 frameR3= new FrameRecepti3();
			frameR3.setVisible(true);
			break;
			
			case 9: FrameKorisnici1 frameK1= new FrameKorisnici1();
			frameK1.setVisible(true);
			break;
			
			/*case 10: FrameKorisnici2 frameK2= new FrameKorisnici2();
			frameK2.setVisible(true);
			break;*/
			
			case 11: FrameKupovina1 frameK3= new FrameKupovina1();
			frameK3.setVisible(true);
			break;
			
			/*case 12: FrameBrisanjeLekova frameB= new FrameKupovina1();
			frameB.setVisible(true);
			break;*/
			
			case 13: FrameIzvestaj1 frameI1= new FrameIzvestaj1();
			frameI1.setVisible(true);
			break;
			
			case 14: FrameIzvestaj2 frameI2= new FrameIzvestaj2();
			frameI2.setVisible(true);
			break;
			
			case 15: FrameIzvestaj3 frameI3= new FrameIzvestaj3();
			frameI3.setVisible(true);
			break;
			
			default:
				System.out.println("Uneli ste nepostojeću vrednost!");
				break;
			}
		}else{
			
			System.out.println("Niste uneli vrednost ulaznog parametra!");
			
		}

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istpage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class IMAGECREATOR {
     static void IMAGECREATORmain2() {
		System.out.println("Creating an image!");
		int k=30,mf=12;      

 Font Fontbold = new Font("Courier", Font.BOLD  ,10);
 Font Fontnormal = new Font("Courier", Font.PLAIN | Font.PLAIN,8);
 Font Fontnormalbold = new Font("Courier", Font.BOLD,8);
		int width = 620 ;
		int height = 800;

		//create a BufferedImage for mentioned image types.
		BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		//create a graphics2d object which can be used to draw into the buffered image
		Graphics2D g = buffImg.createGraphics();
		
		//fill the rectangle with grey color
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		
		//draw a string
		g.setColor(Color.BLACK);
		//g.setFont(new Font("TimesRoman", Font.BOLD, 40)); 
		//g.drawString("JavaXp.com", 20, 100);
		//    g2d.translate(pf.getImageableX(), pf.getImageableY());
        Font Font1 = new Font("Courier", Font.BOLD ,14);
          g.setFont(Font1); 
          g.drawString("TechnoLand", 20, 50);
          g.drawString("Service Call Report", 200, 24);
        
      
      g.drawRect(k+100, 30,(6*60) ,30 );
          g.setFont(Fontbold);
        g.drawString(functions.lbltxt[1],30,24);
          g.setFont(Fontnormal);
         g.drawString(functions.txt[1].getText(),70,24);
       
      int km=0;
            for(int i=0;i<6;i++)
       {  g.setFont(Fontnormalbold);
           if (i==1) continue; 
        g.drawString(functions.lbltxt[i],k+110+(km*70),42);
           g.setFont(Fontnormal);
         if (i==1) continue; 
       g.drawString(functions.txt[i].getText(),k+110+(km*70),53);
       if (i==1) continue; km++;
      
       }
       
     
      
       //address
       Font address = new Font("Courier", Font.BOLD ,10);
       g.setFont(address); 
     g.drawString(cust_detail_form.addd1, 150, 72);
     g.drawString(cust_detail_form.addd2, 100, 84);
      
       
    //...customer.........................
       g.drawRect(15,k+85,(k+10+(6*90)) ,100 );
       g.setFont(Fontbold); 
       g.drawString("Customer Details",k+ 40,110);
       int cc=50,kac=6;
       for(int i=6;i<13;i++) 
           
       {  g.setFont(Fontnormalbold); if(i==8) continue;
         g.drawString(functions.lbltxt[i],       k+10,  cc+7+(kac*mf));
           g.setFont(Fontnormal);  if(i==8) continue;
         g.drawString(functions.txt[i].getText(),k+100, cc+7+(kac*mf));
           if(i==8) continue; kac++;
       }
       g.setFont(Fontnormalbold);
       g.drawString(functions.lbltxt[8],       k+10,  cc+11+(kac*mf));
       g.setFont(Fontnormal); 
       g.drawString(functions.txt[8].getText(),k+100, cc+11+(kac*mf));
           
        //..product details....................
          g.drawRect(300, k+85,(k+20+(6*90))/2,80);
        g.setFont(Fontbold);
        g.drawString("Product Details", k+300,110);
       for(int i=13;i<19;i++)
       { g.setFont(Fontnormalbold);
         g.drawString(functions.lbltxt[i],       k+280,cc+5+((i-7)*mf));
         g.setFont(Fontnormal);                                           //,cc+20+(kac*10)
        g.drawString(functions.txt[i].getText(),k+420, cc+5+((i-7)*mf));
       }
       
   
        //accessories details ....................
      int down=45;  
      g.setFont(Fontbold);
      g.drawString("Accessories Details", k+200,195+down);
      g.drawRect(15, 205+down,k+10+(6*90) ,115);
        
        //accessories details 1....................
       
      
        int addy=-10;
       for(int i=19;i<=27;i++)
       { g.setFont(Fontnormalbold);
        g.drawString(functions.lbltxt[i], k+10,down+addy+((i)*mf));
         g.setFont(Fontnormal);
        g.drawString(functions.txt[i].getText(),k+100,down+addy+((i)*mf));
    }
       for(int i=19;i<=27;i++) {    }
        //accessories details 2......................
      
        for(int i=28;i<37;i++)
       {   g.setFont(Fontnormalbold); 
          g.drawString(functions.lbltxt[i], k+250,down+((i-10)*mf));
           g.setFont(Fontnormal);
          g.drawString(functions.txt[i].getText(),k+340, down+((i-10)*mf));
       }
    
        //issue dia........................  
       int aa=400;
       int lenar = functions.lbltxtarea.length;
       for(int i=0;i<lenar;i++)
       { g.setFont(Fontbold);
        g.drawRect(15,k+aa-60+(i*100),(k+10+(6*90)) ,100 );
         g.drawString(functions.lbltxtarea[i],k+20,aa-15+(i*100));
         g.setFont(Fontnormal);
       g.drawString(functions.txtarea[i].getText(), k+90,aa-15+(i*100));  
       }                                             // k+160,aa+(i*100))
//.................Miscellaneous Comments...........................
String misc="Miscellaneous Comments";
g.setFont(Fontbold);
g.drawString(misc,20,k+555);
 int miscdown=14;
String mis[]={"Straches/Damages/Breakages","Others"};
    for(int i=0;i<mis.length;i++)
       { g.setFont(Fontnormalbold);
        g.drawRect(15,k+545+miscdown+(i*20),(k+10+(6*90)) ,20);
         g.drawString(mis[i],20,k+555+miscdown+(i*20));
 
       }                                          
//...................................................   
String note ="Note: ";
String notedes1 ="In case of Hard Disk failure or reinstallation of OS due to any reason, it may require formatting the Hard Disk. This may lead to loss of data. Hence, it is ";
String notedes2 = "advisable for the customer to backup important files / data & programs. Application software will not be installed apart from the recommended operating system,";
String notedes3 = "including drivers and patches. Kindly refer to warranty terms and Conditions for more information.";
g.setFont(Fontnormalbold);
g.drawString(note, 25,k+630);
g.setFont(Fontnormal);
g.drawString(notedes1, 50,k+630);
g.drawString(notedes2, 25,k+640);
g.drawString(notedes3, 25,k+650);



String ca = "Customer Authorization:";
String ca2= " I hereby authorize HP Support Provider to provide the necessary repair service. I have taken backup of all important data program/application.";
String ca3= " in the  hard disks";
g.drawRect(15,k+660,(k+10+(6*90)) ,80 );
g.setFont(Fontnormalbold);
g.drawString(ca, 25,700);
g.setFont(Fontnormal);
g.drawString(ca2, 25,715);
//g.drawString(ca3, 25,735);
g.setFont(Fontnormalbold);
g.drawString("Customer Signature :",25,735);
g.drawString("HP Stamp :",250,735);
//disposes of this graphics context and releases any system resources that it is using
		g.dispose();
		
		//write the image file
	
	File f = new File("C:\\Users\\hp\\Desktop\\HP\\Istpage_final2\\src\\istpage\\icon.png");	
        try {
			ImageIO.write(buffImg, "png", f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(f.getAbsolutePath()+" created successfully!");
	}
}

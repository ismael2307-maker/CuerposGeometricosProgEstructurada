import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int operacion;
        int intentos=0,ola=1;

        while(ola==1){

        System.out.println("1.-Prisma 2.Cilindro 3.-Piramide 4.-Cono 5.-Esfera 6.-Zona esferica 7.-Casquete esferico 8.-Huso esferico y cuña esferica");
        System.out.println("9.-Ortoedro 10.-Tetraedro 11.-Hexaedro 12.-Octaedro 13.-Dodecaedro 14.-Icosaedro 15.-Tronco de cono 16.-Tronco de piramide");  
        System.out.println("  "); 
         System.out.println("Digite su opcion");
        operacion=x.nextInt(); 

        while(operacion<=0 && intentos<3){
         intentos++;
        System.out.println("Digite su opcion de nuevo");
        operacion=x.nextInt();
        }
        if(intentos==3){
            System.out.println("Ha intentado muchas veces, regresa mas tarde");
            break;
        }

        switch(operacion){
         case 1:{
         double Al,At,Abase,Apo,p,h,Vol;
        
         System.out.println("Digite la base(p)");
         p=x.nextInt();
         while(p<=0 && intentos<3){
          intentos++;
          System.out.println("Digite la base(p) de nuevo");
         p=x.nextInt();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
        
         System.out.println("Digite la altura(h)");
         h=x.nextInt();
         while(h<=0 && intentos<3){
          intentos++;
          System.out.println("Digite la altura(h) de nuevo");
         h=x.nextInt();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
    
         System.out.println("Digite el apotema de la piramide(Apo)");
         Apo=x.nextDouble();
           while(Apo<=0 && intentos<3){
          intentos++;
          System.out.println("Digite el apotema (Apo) de nuevo");
         Apo=x.nextInt();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         //Formulas de:Area Lateral(Al), Abase(Abase), Area Total(At) y Volumen(Vol).
         Al=5*(p)*(h);
         Abase=5*(p)*(Apo)/2;
         At=Al+2*(Abase);
         Vol=Abase*h;

         //Resultados.
         System.out.println("El area lateral es: "+Al+ " Unidades Cuadradas");
         System.out.println("El area total de la piramide es: "+At+ " Unidades Cuadradas");
         System.out.println("El volumen de la piramide es: "+Vol+ " Unidades Cubicas");
          break;
          }
          case 2:{
         final double PI=3.1416;
         double Al,At,Vt,Pbase,r,h;
    
         System.out.println("Digite el radio(r)");
         r=x.nextDouble();
         while(r<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el radio(r) de nuevo");
         r=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite la altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
        
         //Formulas de: Pbase(Pbase), Area Lateral(Al), Area Total(At) y Volumen(Vt).
         Pbase=2*PI*(r);
         Al=Pbase*h;
         At=2*PI*(r)*(h+r);
         Vt=PI*Math.pow(r, 2)*(h);
    
         System.out.println("El Area Lateral es:"+Al+ " Unidades Cuadradas");
         System.out.println("El Area total es:"+At+ " Unidades Cuadradas");
         System.out.println("El Volumen Total es:"+Vt+ " Unidades Cubicas");

           break;
          }
          case 3:{
          double pb,ap,Ap,h,Al,At,Ab,Vt ;

         System.out.println("Digite el Apotema Base(ap)");
         ap=x.nextDouble();
         while(ap<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el apotema base(ap) de nuevo");
         ap=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite el apotema Piramide(Ap)");
         Ap=x.nextDouble();
          while(Ap<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el apotema Piramide(Ap) de nuevo");
         Ap=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite la altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Formulas para calcular:Pbase(pb), Area Lateral(Al), Abase(Ab) y Volumen(Vt).
         pb=4*ap;
         Al=pb*Ap/2;
         Ab=ap*ap;
         At=Al+Ab;
         Vt=Ab*h/3;
         System.out.println("El area lateral es: "+Al+" Unidades Cuadradas");
         System.out.println("El area total es: "+At+" Unidades Cuadradas");
         System.out.println("El Volumen es: "+Vt+" Unidades Cubicas");
           break;
          }
          case 4:{
         final double PI=3.1416;
         double Al,At,r,g,h,Vol;
    
         System.out.println("Digite el radio menor(r)");
         r=x.nextDouble();
         while(r<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el radio menor(r) de nuevo");
         r=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite el Generatriz(g)");
         g=x.nextDouble();
         while(g<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Generatriz(r) de nuevo");
         g=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite la altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }           
         //Formulas de:Area Lateral(Al), Area Total(At) y Volumen(Vol).
         Al=PI*r*g;
         At=Al+(PI*Math.pow(r, 2));
         Vol=PI*Math.pow(r, 2)*h/3;
         //Resultados
         System.out.println("El area lateral es: "+Al+ " Unidades Cuadradas");
         System.out.println("El area total es: "+At+ " Unidades Cuadradas");
         System.out.println("El volumen es: "+Vol+ " Unidades Cubicas");
           break;
          }
          case 5:{
         final double PI=3.1416;
         double Area,Vol,r;
       
         System.out.println("Digite el Radio(r)");
         r=x.nextDouble();
         while(r<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el radio(h) de nuevo");
         r=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 
         //Formulas para calcular area y volumen
         Area=4*PI*Math.pow(r,2);
         Vol=PI*Math.pow(r, 3)*4/3;
         //Resultados
         System.out.println("El area de la esfera es: "+Area+ " Unidades Cuadradas");
         System.out.println("El Volumen de la esfera es: "+Vol+ " Unidades Cubicas");
          break;
         }
         case 6:{
         final double PI=3.1416;
         double R,h,r1,r2,Az,Vol;

         System.out.println("Digite el Radio Mayor(R)");
         R=x.nextDouble();
         while(R<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Mayor(R) de nuevo");
         R=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 

         System.out.println("Digite el Radio Menor 1(r1)");
         r1=x.nextDouble();
         while(r1<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Menor(r1) de nuevo");
         r1=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 

         System.out.println("Digite el Radio Menor 2(r2)");
         r2=x.nextDouble();
         while(r2<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Menor 2(r2) de nuevo");
         r2=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 

         System.out.println("Digite la Altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 
         //Formulas de: area(Az) y Volumen(Vol).
         Az=2*PI*R*h;
         Vol=PI*h/6*(3*Math.pow(r1, 2)+3*Math.pow(r2,2)+Math.pow(h,2));
         //Resultados.
         System.out.println("El Area de la zona Esferica es: "+Az+ " Unidades Cuadradas");
         System.out.println("El Volumen de la zona Esferica es: "+Vol+ " Unidades Cubicas");
          break;
         }
         case 7:{
         final double PI=3.1416;
         double AreaC,Area,VolC,Vol,R,r,h;
    
         System.out.println("Digite el Radio Mayor(R)");
         R=x.nextDouble();
         while(R<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Mayor(R) de nuevo");
         R=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 

         System.out.println("Digite el Radio Menor(r)");
         r=x.nextDouble();
         while(r<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Menor(r) de nuevo");
         r=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 
    
         System.out.println("Digite la altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 
         //operaciones
         AreaC=2*PI*R*h; //En funcion del Radio de la esfera.
         Area=PI*(Math.pow(r,2)+Math.pow(h,2)); //En funcion del radio menor.
         VolC=PI*Math.pow(h,2)*(3*R-h)/3; //En funcion del Radio de la esfera.
         Vol=PI*h/6*(3*Math.pow(r,2)+Math.pow(h,2)); //En funcion del radio menor.
         //Resultados
         System.out.println("El Area del Casquete en funcion del Radio de la esfera es: "+AreaC+ " Unidades Cuadradas");
         System.out.println("El Area del Casquete en funcion del radio menor es: "+Area+ " Unidades Cuadradas");
    
         System.out.println("El Volumen del Casquete en funcion del Radio de la esfera es: "+VolC+ " Unidades Cubicas");
         System.out.println("El Volumen del Casquete en funcion del radio menor es: "+Vol+ " Unidades Cubicas");

          break;
         }
         case 8:{
         final double PI=3.1416;
         double R,Angulo,Area,Vol;
     
         System.out.println("Digite el Radio Mayor(R)");
         R=x.nextDouble();
         while(R<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el Radio Mayor(h) de nuevo");
         R=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 

         System.out.println("Digite el angulo(Angulo)");
         Angulo=x.nextDouble();
         while(Angulo<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el angulo(Angulo) de nuevo");
         Angulo=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         } 
         //Operaciones
         Area=PI*Math.pow(R,2)*Angulo/90; //Formula simplificada
         Vol=PI*Math.pow(R,3)*Angulo/270; //Formula Simplificada;
         //Resultados
         System.out.println("El Area del Huso Esferico es: "+Area+ " Unidades Cuadradas");
         System.out.println("El Volumen de la Cuña Esferica es: "+Vol+ " Unidades Cubicas");
         }
         case 9:{
         double Area,Vol,Diagonal;
         double a,b,c;
       
         System.out.println("Digite el valor de a");
         a=x.nextDouble();
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
       
         System.out.println("Digite el valor de b");
         b=x.nextDouble();
         while(b<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (b) de nuevo");
         b=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite el valor de c");
         c=x.nextDouble();
         while(c<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (c) de nuevo");
         c=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones
         Area=2*(a*b+a*c+b*c);
         Vol=a*b*c;
         Diagonal=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
         //Resultados
         System.out.println("El area del Ortoedro es: "+Area+ " Unidades Cuadradas");
         System.out.println("El volumen del Ortoedro es: "+Vol+ " Unidades Cubicas");
         System.out.println("La diagonal del Ortoedro es: "+Diagonal+ " Unidades");
          break;
         }
         case 10:{
         double Area,Vol,Altura;
         double a;
     
         System.out.println("Digite el valor de a");
         a=x.nextDouble();
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones
         Area=Math.pow(a,2)*Math.sqrt(3);
         Vol=Math.sqrt(2)/12*Math.pow(a,3);
         Altura=a*Math.sqrt(6)/3;
         //Resultados
         System.out.println("El Area del Tetraedro es: "+Area+ "Unidades Cuadradas");
         System.out.println("El Volumen del Tetraedro es: "+Vol+ "Unidades Cubicas");
         System.out.println("La altura del Tetraedro es: "+Altura);
          break;
         }
         case 11:{
         double Area,Vol,Diagonal,a;

         System.out.println("Digite el valor de a");
         a=x.nextDouble();
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones.
         Area=6*Math.pow(a,2);
         Vol=Math.pow(a,3);
         Diagonal=a*Math.sqrt(3);
         //Resultados
         System.out.println("El area del Hexaedro es: "+Area+" Unidades Cuadradas");
         System.out.println("El Volumen del Hexaedro es: "+Vol+" Unidades Cubicas");
         System.out.println("La Diagonal del Hexaedro es: "+Diagonal+" Unidades");
          break;
         }
         case 12:{
         double Area,Volumen;
         double a;
    
         System.out.println("Digite el valor de a");
         a=x.nextDouble();   
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         // Operaciones
         Area=2*Math.pow(a,2)*Math.sqrt(3);
         Volumen=Math.sqrt(2)/3*Math.pow(a,3); 
         //Resultados
         System.out.println("El area del Octaedro es:"+Area+ " Unidades Cuadradas");
         System.out.println("El Volumen del Octaedro es:"+Volumen+ " Unidades Cubicas");
          break;
         }
         case 13:{
         double Area, volumen,a;

         System.out.println("Digite el valor de la arista(a)");
         a=x.nextDouble();
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones
         Area=3*Math.pow(a, 2)*Math.sqrt(25+10*Math.sqrt(5));
         volumen=(15+7*Math.sqrt(5))*Math.pow(a, 3)/4;

         //Resultados
         System.out.println("El area es: "+Area+ " Unidades Cuadradas");
         System.out.println("El Volumen es: "+volumen+ " Unidades Cubicas");
          break;
         }
         case 14:{
         double Area, Volumen;
         double a;
     
         System.out.println("Digite el valor de la arista(a)");
         a=x.nextDouble();
         while(a<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de (a) de nuevo");
         a=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones
         Area=5*Math.pow(a,2)*Math.sqrt(3);
         Volumen=(3+Math.sqrt(5))*Math.pow(a, 3)*5/12;
         //Resultados
         System.out.println("El Area es: "+Area+ "Unidades Cuadradas");
         System.out.println("El Volumen es: "+Volumen+ "Unidades Cubicas");
          break;
         }
         case 15:{
         final double PI=3.1416;
         double AreaLateral,AreaTotal,Volumen;
         double g,AB,Ab,h,R,r;
    
         System.out.println("Digite el valor de la generatriz(g)");
         g=x.nextDouble();
         while(g<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de la generatriz(g) de nuevo");
         g=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
    
         System.out.println("Digite el valor del Radio Mayor(R)");
         R=x.nextDouble();
         while(R<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor del Radio Mayor(R) de nuevo");
         R=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
    
         System.out.println("Digite el valor del radio menor(r)");
         r=x.nextDouble();
         while(r<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor del radio menor(r) de nuevo");
         r=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
    
         System.out.println("Digite el valor de la altura(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones.
         AreaLateral=PI*g*(R+r);
         AB=PI*Math.pow(R,2); //Formula de Abase mayor.
         Ab=PI*Math.pow(r,2); //Formula de Abase menor.
         AreaTotal=AreaLateral+AB+Ab;
         Volumen=PI*h*(Math.pow(R,2)+Math.pow(r,2)+R*r)/1/3;
         //Resultados.
         System.out.println("El Area Lateral del tronco de cono es de: "+AreaLateral+ " Unidades Cuadradas");
         System.out.println("El Area Total del tronco de cono es de: "+AreaTotal+ " Unidades Cuadradas");
         System.out.println("El Volumen del tronco de cono es de: "+Volumen+ " Unidades Cubicas");
         System.out.println("    ");
         //Nota:Estos valores(Abase mayor y Abase menor), es para poder calcular El area total Segun la formula de la imagen(aunque no apareza como obtenerlos)
         System.out.println("El valor de ABase Mayor es: "+AB+ " Unidades Cuadradas");
         System.out.println("El valor de Abase menor es: "+Ab+ " Unidades Cuadradas");
         System.out.println("    ");
          break;
         }
         case 16:{
         double AreaLateral,AreaTotal,Volumen,Ac,l;
         double ap,h,PB,Pb,Ab1,Ab2;
   
         System.out.println("Digite el valor de las caras laterales del tronco de piramide");
         l=x.nextDouble();
         while(l<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de las caras laterales(l) de nuevo");
         l=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite el valor del apotema(ap)");
         ap=x.nextDouble();
         while(ap<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor del apotema(ap) de nuevo");
         ap=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
   
         System.out.println("Digite el valor de la altutra(h)");
         h=x.nextDouble();
         while(h<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de la altura(h) de nuevo");
         h=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }

         System.out.println("Digite el valor de PB");
         PB=x.nextDouble();
         while(PB<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de PB de nuevo");
         PB=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
   
         System.out.println("Digite el valor de Pb");
         Pb=x.nextDouble();
         while(Pb<=0 && intentos<3){
         intentos++;
         System.out.println("Digite el valor de Pb de nuevo");
         Pb=x.nextDouble();
         }
         if(intentos==3){
         System.out.println("Ha intentado muchas veces, regresa mas tarde");
         break;
         }
         //Operaciones
         Ac=(PB+Pb)*ap/2;
         AreaLateral=l*Ac;
         AreaTotal=AreaLateral+Math.pow(PB,2)+Math.pow(Pb,2);
         Ab1=Math.pow(PB,2);
         Ab2=Math.pow(Pb,2);
         Volumen=h*(Ab1+Ab2+Math.sqrt(Ab1*Ab2))/3;
         //Resultados
         System.out.println("El Area Lateral es: "+AreaLateral+ " Unidades Cuadradas");
         System.out.println("El Area Total es: "+AreaTotal+ " Unidades Cuadradas");
         System.out.println("El Volumen  es: "+Volumen+ " Unidades Cubicas");
          break;
         }
        }//switch
        System.out.println("¿Quiere seguir usando el programa?");
        System.out.println("Aprieta 1 para Seguir");
        System.out.println("Aprieta 2 para Salir");
        ola=x.nextInt();
        intentos-=3;
        if(ola==2){
            System.out.println("Muchas Gracias. Vuelva pronto");
        }
     }
     x.close();
    }

}
